package com.example.schedule_second.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class ResponseDto {
    private String username;
    private String title;
    private String todo;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
