package org.example.greetserviceeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GreetServiceEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetServiceEurekaClientApplication.class, args);
	}

}
