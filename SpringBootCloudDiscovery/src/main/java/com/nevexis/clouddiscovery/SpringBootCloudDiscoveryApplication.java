package com.nevexis.clouddiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootCloudDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCloudDiscoveryApplication.class, args);
	}
}
