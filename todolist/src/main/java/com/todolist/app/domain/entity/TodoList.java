package com.todolist.app.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.ArrayList;

@Entity
public class TodoList {

    @Id
    private String id;
    private ArrayList<Task> tasks = new ArrayList<>();

    public TodoList() {
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
}
