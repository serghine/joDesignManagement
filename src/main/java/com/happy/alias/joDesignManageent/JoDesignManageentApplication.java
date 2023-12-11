package com.happy.alias.joDesignManageent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.happy.alias.joDesignManageent.repositories")
public class JoDesignManageentApplication {
	public static void main(String[] args) {
		SpringApplication.run(JoDesignManageentApplication.class, args);
	}
}
