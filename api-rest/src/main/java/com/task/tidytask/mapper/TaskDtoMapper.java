package com.task.tidytask.mapper;

import com.task.tidytask.domain.model.TaskDomain;
import com.tidytask.dto.TaskDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskDtoMapper {
    TaskDto toTaskDto(TaskDomain taskDomain);
    TaskDomain toTaskDomain(TaskDto task);
    List<TaskDto> toTaskDtoList(List<TaskDomain> taskDomains);
}
