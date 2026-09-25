package com.todolist.app.domain.repository;

import com.todolist.app.domain.entity.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends  CrudRepository<Task, String> { }
