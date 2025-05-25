package com.dileep.onlinecourseplatform.Modules;

import com.dileep.onlinecourseplatform.CourseModules.CourseModule;

import java.util.List;

public class ImportantModule implements CourseModule {
    private final List<String> topics;

    public ImportantModule(List<String> topics) {
        this.topics=topics;
    }

    @Override
    public List<String> displayOverview() {
        return topics;
    }
}
