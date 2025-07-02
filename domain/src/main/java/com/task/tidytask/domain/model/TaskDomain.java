package com.task.tidytask.domain.model;

import lombok.Data;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
public class TaskDomain {
    private UUID id;

    private  String description;

    private  Boolean completed;

    private LocalDate date;

    private  String hour;
}
