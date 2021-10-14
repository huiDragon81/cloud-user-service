package com.example.userservice.config;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class FeignErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String method, Response response) {
        switch (response.status()) {
            case 400: break;
            case 404:
                if (method.contains("getOrders")) {
                    return new ResponseStatusException(HttpStatus.valueOf(response.status()), "users orders is empty");
                }
                break;
            default:
                return new Exception(response.reason());
        }
        return null;
    }
}
