package org.example.finalproject1.DAL;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name="type")
    private UserType type;

    public boolean isAdmin() {
        return type == UserType.Admin;
    }
}
