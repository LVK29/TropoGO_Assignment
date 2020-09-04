package com.lvk.jobPost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.lvk.jobPost.controller.JobPostController;

@EntityScan(basePackages = { "com.lvk.jobPost" })
@SpringBootApplication
public class JobPostApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobPostApplication.class, args);
	}

}
