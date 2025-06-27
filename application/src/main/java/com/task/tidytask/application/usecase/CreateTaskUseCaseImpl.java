package com.task.tidytask.application.usecase;

import com.task.tidytask.domain.model.TaskDomain;
import com.task.tidytask.application.port.input.CreateTaskUseCase;
import com.task.tidytask.domain.repository.TaskService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

    private final TaskService taskService;

    @Override
    public TaskDomain createTask(final TaskDomain task) {
        return this.taskService.saveTask(task);
    }
}
