package com.pelu.pelu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.pelu.pelu.controller.PeluqueriaController;

@SpringBootApplication
public class PeluApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeluApplication.class, args);
	}

}
