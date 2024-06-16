package com.colourProject.entity;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Builder
public class Color {
    private int colourId;
    private int userId;
    private String colourCode;
    private int count;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}
