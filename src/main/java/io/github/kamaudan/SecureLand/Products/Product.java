package io.github.kamaudan.SecureLand.Products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table
public class Product {

    @PrimaryKey
    private ProductKey key;
    private String email;
}
