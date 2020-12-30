package clicker.back.entities;

import javax.persistence.*;

@Entity(name = "user")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;

    @Column(unique = true,length = 100)
    String email;

    @Column(length = 100)
    String password;

    @Column(length = 1000)
    String name;

    @Column
    Boolean permitido;

    @Column
    Boolean admin;

    @Column
    Boolean superuser;
}
