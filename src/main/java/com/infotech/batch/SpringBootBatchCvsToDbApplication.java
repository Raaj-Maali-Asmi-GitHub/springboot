package com.infotech.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = "com.infotech.batch.*")
public class SpringBootBatchCvsToDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBatchCvsToDbApplication.class, args);
	}

}
