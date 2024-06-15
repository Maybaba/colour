package com.corourProject.entity.dto;

import lombok.*;

import java.security.Timestamp;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Builder
public class Colors {
    private int colourId;
    private int userId;
    private String colourCode;
    private int count;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}
