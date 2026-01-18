package org.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @Value("${message}")
    private String message;
    @RequestMapping("/greetconfigclient")
    Greet greet(){
        return new Greet(message);
    }
}
