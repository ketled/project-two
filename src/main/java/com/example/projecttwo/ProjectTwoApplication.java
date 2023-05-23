package com.example.projecttwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProjectTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectTwoApplication.class, args);
    }

}
