package com.dileep.onlinecourseplatform.Factory;

import com.dileep.onlinecourseplatform.CourseModules.CourseModule;
import com.dileep.onlinecourseplatform.Modules.ImportantModule;
import com.dileep.onlinecourseplatform.Modules.IntroModule;
import com.dileep.onlinecourseplatform.Modules.ProjectModule;
import com.dileep.onlinecourseplatform.Modules.VideoModule;

import java.util.List;

public class ModuleFactory {

    public static List<CourseModule> getModulesForCourse(String courseName) {
        if (courseName.equalsIgnoreCase("Java")) {
            return List.of(
                    new IntroModule(List.of("What is Java?", "Java Features", "Setup")),
                    new ImportantModule(List.of("OOP", "Inheritance", "Polymorphism"))
            );
        } else if (courseName.equalsIgnoreCase("Spring")) {
            return List.of(
                    new IntroModule(List.of("Spring Overview", "Dependency Injection", "Spring Annotations")),
                    new ImportantModule(List.of("IoC Container", "Bean Lifecycle", "AOP in Spring"))
                    );
        }

        // Add for other courses...
        return List.of();
    }
}
