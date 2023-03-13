package com.arjun.requests.enquiries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RequestsEnquiriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RequestsEnquiriesApplication.class, args);
	}
}
