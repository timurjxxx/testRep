package com.security.security.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user-table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private Long userId;

    private String username;
    private String password;

}
