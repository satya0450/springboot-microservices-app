package org.example.circuitbreaker;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitBreakerController {

    private ExtClient ec = new ExtClient();

    @RequestMapping("/cbapi")
    @CircuitBreaker(name="cbapi",fallbackMethod = "fallbackAfterRetry")
    public Greet greet(){
        Greet greet = ec.extapi();
        return greet;
    }

    public Greet fallbackAfterRetry(Exception ex){
        return new Greet("All tries are exhausted");
    }
}
