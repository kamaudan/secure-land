package io.github.kamaudan.SecureLand.users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Table
public class User {


    @PrimaryKey
    private int id;
    private String email;
    private String username;
    private String password;

    public User(User user) {
        this(user.getId(),user.getEmail(), user.getPassword(), user.getUsername());
    }
}
