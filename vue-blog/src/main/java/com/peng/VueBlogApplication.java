package com.peng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling//开启定时任务支持
@MapperScan("com.peng.mapper")
@SpringBootApplication
public class VueBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueBlogApplication.class, args);
	}

}
