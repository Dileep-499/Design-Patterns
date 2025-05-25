package com.dileep.onlinecourseplatform.Printer;

import com.dileep.onlinecourseplatform.CourseModules.CourseModule;
import com.dileep.onlinecourseplatform.Courses.OnlineCourses;

import java.util.stream.IntStream;

public class Printing {

    public static void displayCourseInfo(OnlineCourses onlineCourses){
        System.out.println("Course Name: " + onlineCourses.getCourseName());
        System.out.println("Duration: " + onlineCourses.getDuration());

        IntStream.range(0, onlineCourses.getListOfModules().size())
                .forEach(i -> {
                    CourseModule courseModule = onlineCourses.getListOfModules().get(i);
                    System.out.println("Module " + i + " : " + courseModule.getClass().getSimpleName());
                    IntStream.range(0,courseModule.displayOverview().size())
                            .forEach(j->{
                                String topic = courseModule.displayOverview().get(j);
                                System.out.println("\s\s"+"Topic "+ j+ " : "+topic);
                            });
                });
        System.out.println("Price: "+ onlineCourses.getPrice());
    }
}
