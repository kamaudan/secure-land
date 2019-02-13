package io.github.kamaudan.SecureLand.Products;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequestMapping("/prod")
public class ProductController {

    private  final ProductsRepository prods;

    public ProductController(ProductsRepository prods) {
        this.prods = prods;
    }


    @PostMapping("/save")
    public Mono<Product> save(@Valid @RequestBody Product product){
          return Mono.just(product)
                .flatMap(prods::save);

    }

    @GetMapping("/allProducts")
    public Flux<Product> getAll(){
        return prods.findAll();
    }

}
