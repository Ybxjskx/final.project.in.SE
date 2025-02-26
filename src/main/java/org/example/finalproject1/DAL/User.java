package org.example.finalproject1.DAL;

import jakarta.persistence.*;

import java.util.Scanner;

@Entity
@Table(name = "users")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name="type")
    private UserType type;

    @Enumerated(EnumType.STRING)
    @Column(name="password")
    private String password;

    public int User() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your selected password: ");
        String password=scanner.nextLine();
        this.password=password;
        return id;
    }


    public boolean isAdmin() {
        return type == UserType.Admin;
    }

    public boolean correctPassword(String password) {
        return this.password.equals(password);
    }
    public UserType getType() {
        return type;
    }

}
