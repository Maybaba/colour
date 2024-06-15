package com.colourProject.entity.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Builder
public class Hashtag {
    private int hashtagId;
    private String name;
}
