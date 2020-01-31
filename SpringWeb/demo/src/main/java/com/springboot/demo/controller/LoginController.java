package com.springboot.demo.controller;

import com.springboot.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController
{
    @Autowired
    LoginService loginService;
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(ModelMap model)
    {
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String welcome(@RequestParam String name,ModelMap model,@RequestParam String password)
    {
        boolean validate = loginService.validateUser(name,password);
        if(!validate)
        {
            model.put("msg","Invalid Credintals");
            return "login";
        }
        model.put("name",name);
        model.put("pass",password);  //Better to use same names in both
        return "welcome";
    }
}