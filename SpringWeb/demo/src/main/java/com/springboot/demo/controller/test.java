package com.springboot.demo.controller;

import com.springboot.demo.model.Todo;
import com.springboot.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;

public class test
{
    public static void main(String[] args)
    {
        TodoService service = new TodoService();
        System.out.println(service.reteriveUserByUser("siva"));
    }
}
