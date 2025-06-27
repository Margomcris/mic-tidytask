package com.task.tidytask.infrastructure.adapter;

import com.task.tidytask.infrastructure.mapper.TaskEntityMapper;
import com.task.tidytask.domain.model.TaskDomain;
import com.task.tidytask.infrastructure.repository.TaskJPARepository;
import com.task.tidytask.domain.repository.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TaskServiceAdapter implements TaskService {

    private final TaskJPARepository taskJPARepository;
    private final TaskEntityMapper mapper;


    @Override
    public TaskDomain saveTask(TaskDomain task) {
        final var entityTask=this.mapper.toTaskEntity(task);

        return this.mapper.toTaskDomain(this.taskJPARepository.save(entityTask));
    }

}
