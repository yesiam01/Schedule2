package com.example.schedule_second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ScheduleSecondApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScheduleSecondApplication.class, args);
    }
}
