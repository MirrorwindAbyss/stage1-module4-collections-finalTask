package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        TreeSet<String> lessons = new TreeSet<>();
        for (List<String> dayLessons : timetable.values()){
            lessons.addAll(dayLessons);
        }

        return lessons;
    }
}
