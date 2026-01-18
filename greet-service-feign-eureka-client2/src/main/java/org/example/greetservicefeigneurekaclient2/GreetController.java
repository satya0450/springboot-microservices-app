package org.example.greetservicefeigneurekaclient2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GreetController {

    @Autowired
    private RestTemplate restTemplate;
    private String message;

    @RequestMapping("/greetcall")
    public Greet greet(){
        Greet gt = restTemplate.getForObject("http://greet-service-eureka-client/greet",Greet.class);
        return gt;
    }
}
