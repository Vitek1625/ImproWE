package com.vitek.improWE.task;

import java.util.Date;

import com.vitek.improWE.tag.Tag;
import com.vitek.improWE.utils.Status;

public class Task {
    private Long id;
    private String name;
    private String description;
    private Date dueDate;
    private Status completed;
    private Tag[] tags;
}
