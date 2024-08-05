package com.example.aopPractice;

import com.example.aopPractice.business.BusinessLogic1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopPracticeApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(getClass());
	private BusinessLogic1 businessLogic1;
	public AopPracticeApplication(BusinessLogic1 businessLogic1){
		this.businessLogic1 = businessLogic1;
	}

	public static void main(String[] args) {
		SpringApplication.run(AopPracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Value returned is {}",businessLogic1.calculateMax());
	}
}
