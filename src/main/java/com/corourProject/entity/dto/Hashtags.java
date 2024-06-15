package com.corourProject.entity.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Builder
public class Hashtags {
    private int hashtagId;
    private String name;
}
