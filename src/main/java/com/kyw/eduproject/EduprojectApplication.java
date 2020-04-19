package com.kyw.eduproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kyw.eduproject.mapper")
public class EduprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduprojectApplication.class, args);
	}

}
