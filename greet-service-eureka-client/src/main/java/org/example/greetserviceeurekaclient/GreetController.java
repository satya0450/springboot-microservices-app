package org.example.greetserviceeurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    @Value("${server.port}")
    private String portnumber;

    @RequestMapping("/greet")
    public Greet greet(){
        return new Greet("Port:"+portnumber);
    }
}
