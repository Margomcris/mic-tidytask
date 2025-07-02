package com.task.tidytask.application.port.input;

import com.task.tidytask.domain.model.TaskDomain;

import java.util.List;

public interface FindAllTasksUseCase {

    List<TaskDomain> findAllTasks();
}
