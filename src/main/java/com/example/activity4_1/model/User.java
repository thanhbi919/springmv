package com.example.activity4_1.model;

import com.example.activity4_1.model.Interface.ValidInput;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class User implements ValidInput {
    private String phoneNumber;
    private String password;
    private String email;

    @Override
    public boolean checkPhoneNumber(String phoneNumber) {
        if(phoneNumber.length()!=10)
        return false;
        else return true;
    }

    @Override
    public boolean checkPassword(String password) {
        if(password.length()<6)
            return false;
        else{
            return true;
        }
    }

    @Override
    public boolean checkEmail(String email) {
        if(email.endsWith("@gmail.com")==false)
            return false;
        else return true;
    }
}
