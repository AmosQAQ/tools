package com.example.demojackson.controller;

import com.example.demojackson.dto.SmsCodeDemo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequestMapping("sms")
@RestController
public class SmsCodeController {

    @PostMapping("code")
    public SmsCodeDemo valid(@RequestBody  @Valid SmsCodeDemo demo){
        return demo;
    }
}
