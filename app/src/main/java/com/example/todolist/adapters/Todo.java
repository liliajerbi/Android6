package com.example.todolist.adapters;

public class Todo {
    String desciption;
    String date;

    public Todo(String desciption, String date) {
        this.desciption = desciption;
        this.date = date;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
