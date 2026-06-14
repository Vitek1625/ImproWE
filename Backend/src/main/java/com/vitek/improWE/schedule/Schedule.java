package com.vitek.improWE.schedule;
import com.vitek.improWE.dayCondition.DayCondition;
import com.vitek.improWE.tag.Tag;

public class Schedule {
    private Long id;
    private String name;
    private String description;
    private DayCondition dayCondition;
    private Tag[] tags;
}
