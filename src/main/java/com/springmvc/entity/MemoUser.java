package com.springmvc.entity;

import lombok.*;
import org.apache.ibatis.annotations.Mapper;

@Getter @ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemoUser {
    private String userEmail;
    private String userName;
    private String URcolour;
    private String mood;
}
