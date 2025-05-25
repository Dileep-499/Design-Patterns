package com.dileep.onlinecourseplatform.Modules;

import com.dileep.onlinecourseplatform.CourseModules.CourseModule;

import java.util.List;

public class IntroModule implements CourseModule {
    private final List<String> topics;

    public IntroModule(List<String> topics) {
        this.topics=topics;
    }

    @Override
    public List<String> displayOverview() {
        return topics;
    }
}
