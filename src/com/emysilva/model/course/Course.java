package com.emysilva.model.course;

import java.util.Date;

public class Course extends CourseUtil {

    public Course(String name, int level, String department, String teacher, Date scheduledTime) {
        super(name, level, department, teacher, scheduledTime);
    }

}
