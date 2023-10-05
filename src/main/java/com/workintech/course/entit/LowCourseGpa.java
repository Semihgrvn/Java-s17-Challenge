package com.workintech.course.entit;

import org.springframework.stereotype.Component;

@Component
public class LowCourseGpa implements CourseGpa{

    @Override
    public int getGpa() {
        return 3;
    }
}
