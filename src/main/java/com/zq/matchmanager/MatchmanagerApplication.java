package com.zq.matchmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.zq.matchmanager.mapper")
public class MatchmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatchmanagerApplication.class, args);
	}
}
