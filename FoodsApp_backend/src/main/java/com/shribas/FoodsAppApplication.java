package com.shribas;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodsAppApplication {
	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load(); // loads .env automatically
		System.setProperty("db_pass", dotenv.get("db_pass"));
		SpringApplication.run(FoodsAppApplication.class, args);
	}
}
