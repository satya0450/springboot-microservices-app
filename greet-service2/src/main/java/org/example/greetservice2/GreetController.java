package org.example.greetservice2;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    private  String msg = "Demo with RestTemplate";

    @RequestMapping("/greet")
    public Greet greet(){
        return new Greet(msg);

    }
}
