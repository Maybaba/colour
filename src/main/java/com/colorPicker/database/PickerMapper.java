package com.colorPicker.database;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PickerMapper {
    // 사용자에게 문구 입력받기

    // 2-1. 입력받은 문구 전체조회
    List<YourColour> findAll();

    // 2-2. 입력받은 문구 이미지로 변경

    //2-3. 3D 이미지 연결

    // 문구 새로 등록하기




}
