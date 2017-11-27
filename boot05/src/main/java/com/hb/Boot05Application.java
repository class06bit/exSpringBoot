package com.hb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

//for jsr310 java 8 java.time.*
@EntityScan(
      basePackageClasses = {Boot05Application.class, Jsr310JpaConverters.class}
)

@SpringBootApplication
public class Boot05Application {

	public static void main(String[] args) {
		SpringApplication.run(Boot05Application.class, args);
	}
	
	@Bean
    public CommandLineRunner run(ApplicationContext appContext) {
        return args -> {

            System.out.println("hello World!");

        };
    }
}
