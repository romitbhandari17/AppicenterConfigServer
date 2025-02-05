package com.appicenter.demo.AppicenterConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class AppicenterConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppicenterConfigServerApplication.class, args);
	}

}
