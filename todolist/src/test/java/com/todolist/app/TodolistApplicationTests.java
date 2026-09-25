package com.todolist.app;

import com.todolist.app.application.TaskService;
import com.todolist.app.domain.entity.Task;
import com.todolist.app.domain.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class TodolistApplicationTests {

    @Autowired
    private TaskService taskService;

	@Test
	void contextLoads() {
	}

    @Test
    void createTaskObject() {
        Task task = new Task();

        task.setTitle("Title Task Test");
        task.setDescription("Description Task");
        task.setCompleted(true);

        assertTrue(task.isCompleted());

    }

    @Test
    void saveTaskInDataBase() {

        Task task = new Task();

        task.setTitle("Title Task Test");
        task.setDescription("Description Task");




    }


}
