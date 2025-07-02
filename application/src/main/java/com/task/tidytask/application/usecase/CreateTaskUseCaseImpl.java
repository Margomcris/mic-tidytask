package com.task.tidytask.application.usecase;

import com.task.tidytask.domain.model.TaskDomain;
import com.task.tidytask.application.port.input.CreateTaskUseCase;
import com.task.tidytask.domain.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

    private final TaskRepository taskRepository;

    @Override
    public TaskDomain createTask(final TaskDomain task) {
        return this.taskRepository.saveTask(task);
    }
}
