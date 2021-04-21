package com.example.activity4_1.controller;

import com.example.activity4_1.connection.Connector;
import com.example.activity4_1.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

@RestController
@RequestMapping(value = "/home")

public class Login_Control {
    //api login
    @PostMapping(value = "/login")
    public String login(@RequestBody User user) throws Exception {
        Connector x = Connector.getInstance();
        Connection con = x.getConnection();
        String sql = "select * from users ";
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            if (user.getEmail().equals(rs.getString("email")) == true) {
                if (user.getPassword().equals(rs.getString("passWord")) == true) {
                    return "Login Successed";
                } else return "Email or Password is incorrect";
            } else {
                return "Email does not exist";
            }
        }
        return "Login failed";
    }

    //api register
    @PostMapping(value = "/register")
    public String register(@RequestBody User user) throws Exception {
        Connector x = Connector.getInstance();
        Connection con = x.getConnection();
        String sql = "select email from users ";
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        if (user.checkEmail(user.getEmail()) == false) {
            return "Invaid Email";
        }
        while (rs.next()) {
            if (user.getEmail().equals(rs.getString("email"))==true) {
                return "Email already exists";
            } else {
                if (user.checkPassword(user.getPassword()) == false) {
                    return "Invaid Password";
                }
                if(user.checkPhoneNumber(user.getPhoneNumber())==false){
                    return "Invaid phone number";
                }
            }
        }
        String sql1="INSERT INTO users (phonenumber,email,passWord) VALUES ('"+user.getPhoneNumber()+"','"+user.getEmail()+"','"+user.getPassword()+"')";
        statement.executeUpdate(sql1);
        return "Register Successed";
    }

}

