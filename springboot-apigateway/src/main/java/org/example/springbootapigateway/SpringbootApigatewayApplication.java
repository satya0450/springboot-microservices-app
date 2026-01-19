package org.example.springbootapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApigatewayApplication.class, args);
	}

}
