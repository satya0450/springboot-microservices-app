package org.example.externalclient;

public class Greet {
    private String message;
    public Greet(){}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Greet(String message) {
        this.message = message;
    }
}
