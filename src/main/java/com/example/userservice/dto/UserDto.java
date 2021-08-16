package com.example.userservice.dto;

import com.example.userservice.vo.ResponseOrder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
public class UserDto {

    String email;
    String name;
    String pwd;
    String userId;
    Date createdAt;
    String encryptedPwd;

    List<ResponseOrder> orders;
}
