package com.example.studentapinodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class StudentApiNoDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentApiNoDbApplication.class, args);
    }
}
