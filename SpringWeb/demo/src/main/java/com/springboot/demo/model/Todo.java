package com.springboot.demo.model;

import java.util.Date;

public class Todo
{
    private int count;
    private String user;
    private String desc;
    private Date date;
    private String done;

    @Override
    public String toString() {
        return "ToDo{" +
                "count=" + count +
                ", user='" + user + '\'' +
                ", desc='" + desc + '\'' +
                ", date=" + date +
                ", isComplete='" + done + '\'' +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    public Todo(int count, String user, String desc, Date date, String Done) {
        this.count = count;
        this.user = user;
        this.desc = desc;
        this.date = date;
        this.done = Done;
    }
}
