package com.task.tidytask.application.port.input;

import com.task.tidytask.domain.model.TaskDomain;

public interface CreateTaskUseCase {
    TaskDomain createTask(TaskDomain task);
}
