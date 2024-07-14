package com.kupreychik.chuck_berry_jakarta.model;

import com.kupreychik.chuck_berry_jakarta.model.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class User {
    private static int idCount = 1;
    private int id;
    private String name;
    private String email;
    private UserRole role;

    public User(String name, String email, UserRole role) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.id = idCount++;
    }
}
