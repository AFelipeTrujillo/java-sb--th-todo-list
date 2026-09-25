package com.todolist.app.application;


import com.todolist.app.domain.entity.Task;
import com.todolist.app.domain.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(Task task) {

        task.setId(UUID.randomUUID().toString());

        return taskRepository.save(task);

    }

}
