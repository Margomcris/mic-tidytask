package com.task.tidytask.domain.repository;

import com.task.tidytask.domain.model.TaskDomain;

import java.util.List;

public interface TaskRepository {
    TaskDomain saveTask(TaskDomain task);

//    TaskDomain findTaskById(UUID id);
//
//        void deleteTaskById(UUID id);
//
   List<TaskDomain> findAllTasks();
}
