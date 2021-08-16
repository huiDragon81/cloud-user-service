package com.example.userservice.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestUser {

    @NotNull(message = "email cannot null be null")
    @Size(min = 2)
    String email;

    @NotNull(message = "name cannot null be null")
    @Size(min = 2)
    String name;

    @NotNull(message = "pwd cannot null be null")
    @Size(min = 4)
    String pwd;
}
