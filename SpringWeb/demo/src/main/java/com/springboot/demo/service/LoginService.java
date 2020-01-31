package com.springboot.demo.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService
{
    public boolean validateUser(String user,String pass)
    {
        return user.equalsIgnoreCase("siva") && pass.equalsIgnoreCase("abc");
    }
}
