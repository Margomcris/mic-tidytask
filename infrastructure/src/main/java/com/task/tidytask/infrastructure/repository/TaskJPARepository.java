package com.task.tidytask.infrastructure.repository;

import com.task.tidytask.infrastructure.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface TaskJPARepository extends JpaRepository<TaskEntity,UUID> {
//    TaskEntity save(TaskEntity taskEntity);
}
