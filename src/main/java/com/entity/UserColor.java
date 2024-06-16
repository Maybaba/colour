package com.entity;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Builder
public class UserColor {
    private int userColourId;
    private int userId;
    private String colourCode;
    private LocalDateTime dateRecorded;
}
