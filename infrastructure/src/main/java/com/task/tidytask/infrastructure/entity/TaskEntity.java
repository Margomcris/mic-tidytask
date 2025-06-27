package com.task.tidytask.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Builder
@Entity
@Table(name = "TASKS")
public class TaskEntity {
    @Id
    @Column(name = "ID", nullable = false, unique = true)
    private UUID id;

    @Column(name = "DESCRIPTION")
    private  String description;

    @Column(name = "COMPLETED")
    private  Boolean completed;

    @Column(name = "DATE")
    private OffsetDateTime date;

    @Column(name = "HOUR")
    private  String hour;

    @PrePersist
    private void generateId() {
        if (id == null) {
            id = UUID.randomUUID();
        }
    }
}
