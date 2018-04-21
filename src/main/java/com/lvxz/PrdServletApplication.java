package com.lvxz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lvxz.mapper")

public class PrdServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrdServletApplication.class, args);
	}
}
