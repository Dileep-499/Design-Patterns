package com.dileep.onlinecourseplatform.Factory;

import com.dileep.onlinecourseplatform.CourseModules.CourseModule;
import com.dileep.onlinecourseplatform.Courses.OnlineCourses;
import com.dileep.onlinecourseplatform.Instances.Java;
import com.dileep.onlinecourseplatform.Instances.SpringAndSpringBoot;

import java.util.List;

public class CoursesFactory {
    public static OnlineCourses onlineCourses(String name){
        if(name.equalsIgnoreCase("java")) {
            List<CourseModule> courseModuleList= ModuleFactory.getModulesForCourse(name);
            return new Java("java", 100.0, "3 months", courseModuleList);
        }
        else if(name.equalsIgnoreCase("spring"))
            return new SpringAndSpringBoot(name,120.64,"2 months",ModuleFactory.getModulesForCourse(name));
        else
            throw new IllegalArgumentException("No suitable course found for the given parameters");
    }
}
