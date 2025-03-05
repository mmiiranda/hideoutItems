package com.hideoutItems.hideoutItems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.hideoutItems.hideoutItems.Item.repository") 
public class HideoutItemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HideoutItemsApplication.class, args);
	}			
}
