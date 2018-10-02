package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ZuulRoutingVehicleAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulRoutingVehicleAppApplication.class, args);
	}
	
	@GetMapping("/")
	public String getVehicles() {
		return "Here is the brand new Mercedes C Class";
	}
}
