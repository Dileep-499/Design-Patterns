package com.dileep.onlinecourseplatform.Modules;

import com.dileep.onlinecourseplatform.CourseModules.CourseModule;

import java.util.List;

public class VideoModule implements CourseModule {

    @Override
    public List<String> displayOverview() {
        return List.of();
    }
}
