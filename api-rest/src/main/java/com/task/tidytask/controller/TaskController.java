package com.task.tidytask.controller;

import com.task.tidytask.mapper.TaskDtoMapper;
import com.task.tidytask.application.port.input.CreateTaskUseCase;
import com.tidytask.api.TasksApi;
import com.tidytask.dto.TaskDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class TaskController implements TasksApi {
    private final TaskDtoMapper mapper;
    private final CreateTaskUseCase createTaskUseCase;
@Override
    public ResponseEntity<TaskDto> createTask(final TaskDto task) {
    log.info("Estoy en el controlador");
        if (task == null) {
            log.error("TaskDto is null");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
       final var createdTask= this.createTaskUseCase.createTask(this.mapper.toTaskDomain(task));
        return ResponseEntity.ok(this.mapper.toTaskDto(createdTask));

    }
}
