package com.task.tidytask.controller;

import com.task.tidytask.application.port.input.FindAllTasksUseCase;
import com.task.tidytask.mapper.TaskDtoMapper;
import com.task.tidytask.application.port.input.CreateTaskUseCase;
import com.tidytask.api.TasksApi;
import com.tidytask.dto.TaskDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class TaskController implements TasksApi {
    private final TaskDtoMapper mapper;
    private final CreateTaskUseCase createTaskUseCase;
    private final FindAllTasksUseCase findAllTasksUseCase;
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
    @Override
    public ResponseEntity<List<TaskDto>> getTaskList(){
        log.info("Getting all tasks");
        final var taskList = this.findAllTasksUseCase.findAllTasks();
        if (taskList.isEmpty()) {
            log.warn("No tasks found");
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return ResponseEntity.ok(this.mapper.toTaskDtoList(taskList));
    }
}
