package com.dileep.onlinecourseplatform.Instances;

import com.dileep.onlinecourseplatform.CourseModules.CourseModule;
import com.dileep.onlinecourseplatform.Courses.OnlineCourses;

import java.util.List;

public class SpringAndSpringBoot implements OnlineCourses {
    private final String courseName;
    private final double price;
    private final String duration;
    private final List<CourseModule> courseModuleList;
    public SpringAndSpringBoot(String courseName, double price, String duration, List<CourseModule> courseModuleList) {
        this.courseName = courseName;
        this.price = price;
        this.duration = duration;
        this.courseModuleList = courseModuleList;
    }
    @Override
    public String getCourseName() {
      return courseName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDuration() {
      return duration;
    }

    @Override
    public List<CourseModule> getListOfModules() {
        return courseModuleList;
    }
}
