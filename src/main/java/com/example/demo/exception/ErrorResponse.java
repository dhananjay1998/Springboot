package com.example.demo.exception;

import lombok.Data;

@Data
public class ErrorResponse {
    private String error;
    private int status;
    private String message;
    private String path;

    public ErrorResponse(String error, int status, String message, String path) {
        this.error = error;
        this.status = status;
        this.message = message;
        this.path = path;
    }

    @Override
    public String toString() {
        return  "{ error: " + error + ", status:" + status + " message:"+message + " path:"+path;
    }
}
