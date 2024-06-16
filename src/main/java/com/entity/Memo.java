package com.entity;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Builder
public class Memo {
    private int memoId;
    private int userId;
    private String content;
    private String colourCode;
    private String mediaUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
