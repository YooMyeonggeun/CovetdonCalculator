package com.example.covetdoncalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) //데이터베이스 사용하지 않을시 옵션 추가
public class CovetdonCalculatorApplication {
	public static void main(String[] args) {
		SpringApplication.run(CovetdonCalculatorApplication.class, args);
	}
}
