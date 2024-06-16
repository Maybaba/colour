package com.colourProject.dto.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@ToString
public class MemoRequest {
    private int userId;
    private String content;
    private String colorCode;
    private String mediaUrl;
}
