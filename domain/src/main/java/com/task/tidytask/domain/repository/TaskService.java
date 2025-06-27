package com.task.tidytask.domain.repository;

import com.task.tidytask.domain.model.TaskDomain;

public interface TaskService {
    TaskDomain saveTask(TaskDomain task);

//    TaskDomain findTaskById(UUID id);
//
//        void deleteTaskById(UUID id);
//
//   List<TaskDomain> findAllTasks();
}
