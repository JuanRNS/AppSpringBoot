package com.juan.app_spring_01.resource.exceptions;

import java.io.Serial;
import java.io.Serializable;

public class Error implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String message;
    private Integer status;
    private String path;
    private String error;
    private Long timestamp;

    public Error() {}

    public Error(String message, Integer status, String path, String error, Long timestamp) {}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
