package com.dileep.onlinecourseplatform;

import com.dileep.onlinecourseplatform.CourseModules.CourseModule;
import com.dileep.onlinecourseplatform.Courses.OnlineCourses;
import com.dileep.onlinecourseplatform.Factory.CoursesFactory;
import com.dileep.onlinecourseplatform.Printer.Printing;

import java.util.Locale;
import java.util.stream.IntStream;

public class User {
    public static void main(String[] args) {
        OnlineCourses onlineCourses;
        try {
            onlineCourses = CoursesFactory.onlineCourses("Java");
            Printing.displayCourseInfo(onlineCourses);
            System.out.println("-------------------------------------");
            onlineCourses= CoursesFactory.onlineCourses("spring");
            Printing.displayCourseInfo(onlineCourses);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
