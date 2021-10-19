package com.example.NoteKeeper

import com.example.NoteKeeper.models.CourseInfo
import com.example.NoteKeeper.models.Notes

class DataManager {
    val courses = HashMap<Int, CourseInfo>()
    val notes = ArrayList<Notes>()

    init {
        initializeCourses()
    }

    private fun initializeCourses() {
        var course = CourseInfo(1, "Android Programming", "CS")

        courses.set(course.courseId, course)

        course = CourseInfo(2, "Web Development", "CS")

        courses.set(course.courseId, course)

        course = CourseInfo(3, "Music", "Arts")

        courses.set(course.courseId, course)

    }
}