package com.example.JavaWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class JavaWebApplication {
	@GetMapping("/getmesssage")
public String getMessage() {
	
	return "welcome";
}
	public static void main(String[] args) {
		SpringApplication.run(JavaWebApplication.class, args);
	}

}
