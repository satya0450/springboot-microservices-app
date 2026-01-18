package org.example.feignclientservice;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @Autowired
    public AnyClassNameForFeignClient anyClassNameForFeignClient;

    @RequestMapping("/greetFeign")
    public Greet greet(){

        return anyClassNameForFeignClient.greet();
    }
}
