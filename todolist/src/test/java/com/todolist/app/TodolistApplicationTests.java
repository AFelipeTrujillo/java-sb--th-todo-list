package com.todolist.app;

import com.github.javafaker.Faker;
import com.todolist.app.application.TaskService;
import com.todolist.app.domain.entity.Task;
import com.todolist.app.domain.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureDataSourceInitialization;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

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

        Faker faker = new Faker();
        Task task = new Task();


        task.setTitle(faker.name().title());
        task.setDescription(faker.lorem().paragraph(3));
        task.setCompleted(false);

        Task taskCreated = taskService.createTask(task);

        assertNotNull(taskCreated.getId());


    }

    @Test
    void save1000TasksInDataBase() {

        Task task = new Task();
        Faker faker = new Faker();

        for (int i = 0; i < 1000; i++) {

            task.setTitle(faker.name().title());
            task.setDescription(faker.lorem().paragraph(2));
            task.setCompleted(false);

            taskService.createTask(task);

        }

    }


}
