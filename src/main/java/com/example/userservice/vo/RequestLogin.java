package com.example.userservice.vo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestLogin {

    @NotNull(message = "email cannot null be null")
    @Size(min = 2)
    @Email
    String email;

    @NotNull(message = "pwd cannot null be null")
    @Size(min = 8)
    String password;
}
