package com.example.demojackson.controller;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("user")
    public User user() {
        return User.builder()
                .id(8234567891234567890L)
                .build();
    }

    @PostMapping("test")
    public User add(@RequestBody User user) {
        return user;
    }

    @PostMapping("record1")
    public Record1 record1(@RequestBody Record1 record1) {
        return record1;
    }

    @PostMapping("record2")
    public Record2 record2(@RequestBody Record2 record2) {
        return record2;
    }

    @Builder
    @Data
    public static class User {
        private String name;
        private Long id;
        private Integer age;

        private ShelvesStatus shelvesStatus;
    }

    @Data
    public static class Record1 {
        private Record record;

        @Data
        public static class Record {
            private Integer b;
        }

    }

    @Data
    public static class Record2 {

        private Record record;

        @Data
        public static class Record {
            private Integer a;

        }

    }

}
