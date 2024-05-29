package com.springmvc.entity;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Memo {
    private int memoNum;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private String content;
    private byte[] photo_video;
    private String hashTag;
    private boolean favoriteMark;
    private int colourId;
}
