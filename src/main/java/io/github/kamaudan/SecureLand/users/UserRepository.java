package io.github.kamaudan.SecureLand.users;



import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveCrudRepository<User, Integer> {

    @AllowFiltering
    Mono<User> findByEmail(String username);

}
