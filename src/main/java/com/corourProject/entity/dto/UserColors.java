package com.corourProject.entity.dto;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Builder
public class UserColors {
    private int userColourId;
    private int userId;
    private String colourCode;
    private LocalDateTime dateRecorded;
}
