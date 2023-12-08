package com.jwt.example.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    public String UserId;

    public String name;

    public String email;
}
