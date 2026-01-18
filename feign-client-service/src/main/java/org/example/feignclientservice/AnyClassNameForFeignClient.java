package org.example.feignclientservice;

import feign.Request;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.HttpMediaTypeException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("greet-service-eureka-client")
public interface AnyClassNameForFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/greet")
    Greet greet();


}
