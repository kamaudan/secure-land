package io.github.kamaudan.SecureLand.Products;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@PrimaryKeyClass
public class ProductKey implements Serializable {


    @PrimaryKeyColumn(name = "product_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String id;

    @PrimaryKeyColumn(name = "product_code", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    private int code;

    @PrimaryKeyColumn(name = "date", ordinal = 2, type = PrimaryKeyType.PARTITIONED)
    private Date date;


    @Override
    public int hashCode() {
        return Objects.hash(id, code, date);
    }

    @Override
    public String toString() {
        return "ProductKey{" +
                "id='" + id + '\'' +
                ", code=" + code +
                ", date=" + date +
                '}';
    }
}
