package com.wonder.demo.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestResponse {

    private String message;
    private Boolean error;
    private HttpStatus statusCode;
}
