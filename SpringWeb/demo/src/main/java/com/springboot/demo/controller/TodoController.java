package com.springboot.demo.controller;

import com.springboot.demo.model.Todo;
import com.springboot.demo.service.TodoService;
import com.sun.org.apache.regexp.internal.RE;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Date;

@Controller
@SessionAttributes("name")
public class TodoController
{
    @Autowired
    TodoService todoService;

    @RequestMapping(value = "/list-todos",method = RequestMethod.GET)
    public String listTodos(ModelMap modelMap) {
        String name = (String) modelMap.get("name");
        System.out.println(name);
        modelMap.put("todos", todoService.reteriveUserByUser(name));
        return "list-todos";
    }

    @RequestMapping(value = "/add-todo",method = RequestMethod.GET)
    public String displayAddTodo()
    {
        return "todo";
    }

    @RequestMapping(value = "/add-todo",method = RequestMethod.POST)
    public String AddTodo(ModelMap modelMap, @RequestParam String  desc)
    {
        String name = (String)modelMap.get("name");
        todoService.addTodo(name,desc, new Date(),"false");
        return "redirect:/list-todos";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(@RequestParam int count)
    {
        todoService.deleteTodo(count);
        return "redirect:/list-todos";
    }

    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public String displayUpdatePage(@RequestParam int count,ModelMap modelMap)
    {
        Todo todo = todoService.getTodoById(count);
        modelMap.put("todo",todo);
        return "update";
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String updateDone(@RequestParam String desc,Integer id)
    {
        todoService.updateTodoById(id,desc);
        return "redirect:/list-todos";
    }
}
