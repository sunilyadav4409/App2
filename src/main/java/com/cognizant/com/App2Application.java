package com.cognizant.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App2Application {

	public static void main(String[] args) {
		SpringApplication.run(App2Application.class, args);
	}

        public String getMsg(){
        return "good morning";
        }

}
