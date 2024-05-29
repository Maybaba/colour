package com.springmvc.entity;

import lombok.*;
import org.apache.ibatis.annotations.Mapper;

@Getter @ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Colour {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int colourId;
    private String everydayColor;
    private int colourCount;
}
