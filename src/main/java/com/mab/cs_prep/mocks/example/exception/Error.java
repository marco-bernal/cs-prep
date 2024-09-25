package com.mab.cs_prep.mocks.example.exception;

public class Error {

    private String timestamp;
    private String statusCode;
    private String statusReason;
    private String errorMessage;
    private String path;

    public Error(String timestamp, String statusCode, String statusReason, String errorMessage, String path) {
        this.timestamp = timestamp;
        this.statusCode = statusCode;
        this.statusReason = statusReason;
        this.errorMessage = errorMessage;
        this.path = path;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public String getStatusReason() {
        return statusReason;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getPath() {
        return path;
    }
}
