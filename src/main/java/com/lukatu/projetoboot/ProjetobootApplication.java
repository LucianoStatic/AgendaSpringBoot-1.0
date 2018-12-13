package com.lukatu.projetoboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages="com.lukatu.projetoboot.model")
public class ProjetobootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetobootApplication.class, args);
	}

}

