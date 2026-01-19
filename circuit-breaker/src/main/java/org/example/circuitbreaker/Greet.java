package org.example.circuitbreaker;

public class Greet {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Greet(){

    }
    public Greet(String message){
        this.message = message;
    }
}
