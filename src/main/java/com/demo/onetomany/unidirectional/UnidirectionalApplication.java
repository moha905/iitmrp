package com.demo.onetomany.unidirectional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@EnableJpaAuditing
@SpringBootApplication
public class UnidirectionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnidirectionalApplication.class, args);
	}

}
