package com.example.demojackson.controller;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ShelvesStatus {
    ON(1, "上架"),
    OFF(2, "下架");

    @JsonValue
    private final Integer code;
    private final String desc;
}
