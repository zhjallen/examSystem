package com.zhj.examsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement // 开启事务处理
public class ExamsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamsystemApplication.class, args);
	}

}
