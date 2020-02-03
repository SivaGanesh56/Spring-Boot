package com.springboot.demo.service;

import com.springboot.demo.model.Todo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class TodoService
{
    public boolean validateUser(String user,String pass)
    {
        return user.equalsIgnoreCase("siva") && pass.equalsIgnoreCase("123");
    }

    private static List<Todo>todos = new ArrayList<>();
    private static int todoCount=3;
    static
    {
        todos.add(new Todo(1,"siva","Learn Spring",new Date(),"false"));
        todos.add(new Todo(2,"Ganesh","Learn Junit",new Date(),"false"));
        todos.add(new Todo(3,"siva","Learn Jpa",new Date(),"false"));
    }
    public List<Todo> reteriveUserByUser(String user)
    {
        List<Todo> filterTodos = new ArrayList<>();
        Iterator<Todo> itr =todos.iterator();
        while(itr.hasNext())
        {
            Todo todo = itr.next();
            if(todo.getUser().equalsIgnoreCase(user))
            {
                filterTodos.add(todo);
            }
        }
        return filterTodos;
    }

    public void addTodo(String user, String content, Date date, String isComplete)
    {
        todos.add(new Todo(++todoCount,user,content,date,isComplete));
    }

    public void deleteTodo(int id) {
        Iterator<Todo> iterator = todos.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.getCount() == id) {
                iterator.remove();
            }
        }
    }

    public Todo getTodoById(int id)
    {
        Iterator<Todo> itr = todos.iterator();
        while (itr.hasNext())
        {
            Todo todo = itr.next();
            if(todo.getCount()==id){
                return todo;
            }
        }
        return null;
    }


    public void updateTodoById(int id,String desc)
    {
        Todo todo = getTodoById(id);
        int count = todo.getCount();
        deleteTodo(count);
        todos.add(new Todo(count,"siva",desc,new Date(),"Not Yet"));
    }



}
