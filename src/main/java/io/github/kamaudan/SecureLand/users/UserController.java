package io.github.kamaudan.SecureLand.users;


import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;


import java.security.SecureRandom;


@RestController
public class UserController {


    private SecureRandom random = new SecureRandom();

    private final UserRepository users;

    private final PasswordEncoder encoder;




    public UserController(UserRepository userRepository, PasswordEncoder encoder) {
        this.users = userRepository;
        this.encoder = encoder;
    }


    @PostMapping("/signup")
    public Mono<User> signup(@RequestBody User user) {

        return Mono.just(user)
                .doOnNext(u -> u.setId(random.nextInt()))
                .doOnNext(u -> u.setPassword(this.encoder.encode(u.getPassword())))
                .subscribeOn(Schedulers.parallel())
                .flatMap(users::save);
    }


    @GetMapping("/all")
    public Flux<User>  allUser(){
        return users.findAll();
    }


    @GetMapping("/{id}")
    public Mono<User> oneUser(@PathVariable final int id) {
        return users.findById(id);
    }
}
