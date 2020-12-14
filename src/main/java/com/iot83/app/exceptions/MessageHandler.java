package com.iot83.app.exceptions;

public class MessageHandler {

    private String status;
    private String message;

    MessageHandler() {

    }

    public  MessageHandler(String status, String message) {
        super();
        this.status = status;
        this.message = message;
    }

    public String getErrorCode() {
        return status;
    }

    public void setErrorCode(String errorCode) {
        this.status = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
