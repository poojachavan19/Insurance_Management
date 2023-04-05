package com.project.Insurance_Management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.project.controller")
@EnableJpaRepositories(basePackages = {"com.project.repository"})
@EntityScan(basePackages = {"com.project.entity"})
public class InsuranceManagementApplication {
	public static void main(String[] args) {
		SpringApplication.run(InsuranceManagementApplication.class, args);
	}

}
