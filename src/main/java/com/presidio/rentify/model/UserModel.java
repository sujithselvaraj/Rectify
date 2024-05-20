package com.presidio.rentify.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_model")
public class UserModel
{
    @Id
    @Column(nullable = false,unique = true)
    private String email;
    private String firstname;
    private String lastname;
    @Column(nullable = false,unique = true)
    private String phonenumber;
    private String role;
}
