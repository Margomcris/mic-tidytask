package com.task.tidytask.application.usecase;

import com.task.tidytask.application.port.input.FindAllTasksUseCase;
import com.task.tidytask.domain.model.TaskDomain;
import com.task.tidytask.domain.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class FindAllTasksUseCaseImpl implements FindAllTasksUseCase {
    private final TaskRepository taskRepository;
    @Override
    public List<TaskDomain> findAllTasks() {
        return this.taskRepository.findAllTasks();
    }
}
