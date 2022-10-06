package com.leoneigomes.rentcar.StartApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com.leoneigomes.rentcar")
@SpringBootApplication
public class RentCarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentCarApplication.class, args);
	}

}
