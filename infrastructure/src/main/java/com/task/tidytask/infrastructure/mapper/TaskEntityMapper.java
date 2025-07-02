package com.task.tidytask.infrastructure.mapper;

import com.task.tidytask.infrastructure.entity.TaskEntity;
import com.task.tidytask.domain.model.TaskDomain;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskEntityMapper {
    TaskDomain toTaskDomain(TaskEntity taskEntity);
    TaskEntity toTaskEntity(TaskDomain taskDomain);

    List<TaskDomain> toTaskDomainList(List<TaskEntity> taskEntities);
}
