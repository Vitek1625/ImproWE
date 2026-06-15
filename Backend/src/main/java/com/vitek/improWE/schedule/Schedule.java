package com.vitek.improWE.schedule;

import com.vitek.improWE.dayCondition.DayCondition;
import com.vitek.improWE.tag.Tag;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "schedules")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private DayCondition dayCondition;
    private Tag[] tags;
}
