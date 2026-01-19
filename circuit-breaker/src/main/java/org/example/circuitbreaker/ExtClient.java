package org.example.circuitbreaker;

import org.springframework.web.client.RestTemplate;

public class ExtClient {
    private RestTemplate rt = new RestTemplate();

    public Greet extapi(){
        return rt.getForObject("http://localhost:8182/extapi",Greet.class);
    }
}
