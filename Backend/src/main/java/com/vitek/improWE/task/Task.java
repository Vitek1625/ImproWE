package com.vitek.improWE.task;

import java.util.Date;

import com.vitek.improWE.tag.Tag;
import com.vitek.improWE.utils.Status;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Date dueDate;
    private Status completed;
    private Tag[] tags;
}
