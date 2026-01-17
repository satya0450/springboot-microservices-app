package org.example.restclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GreetClientController {

     private RestTemplate restTemplate = new RestTemplate();

    @RequestMapping("/greetcall")
    public Greet greet(){
        Greet greet = restTemplate.getForObject("http://localhost:8090/greet",Greet.class);
        return greet;
    }
}
