package com.workintech.course.mapping;

import com.workintech.course.entit.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseResponse {

    private Course course;
    private double totalGpa;

}
