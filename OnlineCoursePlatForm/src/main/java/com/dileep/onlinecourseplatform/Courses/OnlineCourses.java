package com.dileep.onlinecourseplatform.Courses;

import com.dileep.onlinecourseplatform.CourseModules.CourseModule;

import java.util.List;

public interface OnlineCourses {

    String getCourseName();
    double getPrice();
    String getDuration();
    List<CourseModule> getListOfModules();

}
