package org.example.externalclient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExternalController {

    private String message="Message from external service";

    @RequestMapping("/extapi")
    public Greet greet(){
        return new Greet(message);
    }
}
