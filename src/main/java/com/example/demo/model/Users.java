package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "users")
public class Users {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int uid;
    public String fname;
    public String lname;

    public Users() {

    }
}
