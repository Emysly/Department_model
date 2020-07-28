package com.emysilva.model;

import com.emysilva.util.CourseUtil;

import java.util.Date;

public class Course extends CourseUtil {

    public Course(String name, int level, String department, String teacher, Date scheduledTime) {
        super(name, level, department, teacher, scheduledTime);
    }

}
