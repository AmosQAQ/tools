package com.example.demojackson.dto;

import com.example.demojackson.validator.Account;
import com.example.demojackson.validator.SmsCode;
import lombok.Data;

@Data
@SmsCode(smsCodeField = "code")
public class SmsCodeDemo {
    @Account
    private String account;
    private String code;
}