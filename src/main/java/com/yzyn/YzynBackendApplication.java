package com.yzyn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yzyn.*.mapper.")
public class YzynBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(YzynBackendApplication.class, args);
	}

}
