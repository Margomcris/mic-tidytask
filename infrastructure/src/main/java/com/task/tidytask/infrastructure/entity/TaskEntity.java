package com.task.tidytask.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TASKS")
public class TaskEntity {
    @Id
    @Column(name = "ID", nullable = false, unique = true)
    private UUID id;

    @Column(name = "DESCRIPTION")
    private  String description;

    @Column(nullable = false, name = "COMPLETED")
    private  boolean completed;

    @Column(name = "DATE")
    private LocalDate date;

    @Column(name = "HOUR")
    private  String hour;

    @PrePersist
    private void generateId() {
        if (id == null) {
            id = UUID.randomUUID();
        }
    }
}
