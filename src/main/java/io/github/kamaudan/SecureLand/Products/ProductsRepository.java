package io.github.kamaudan.SecureLand.Products;

import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

public interface ProductsRepository  extends ReactiveCassandraRepository<Product, Integer> {
}
