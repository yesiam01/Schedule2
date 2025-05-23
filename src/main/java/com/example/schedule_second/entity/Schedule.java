package com.example.schedule_second.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Schedule {

    @Id
    @GeneratedValue
    private Long id;

    private Long userId;
    private String username;
    private String email;
    private String title;
    private String todo;

    @CreatedDate
    @Column
    private LocalDateTime createAt;

    @LastModifiedDate
    private LocalDateTime updateAt;
}