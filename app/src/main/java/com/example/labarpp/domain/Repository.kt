package com.example.labarpp.domain

import com.example.labarpp.db.Student
import java.sql.Timestamp

class Repository {

    fun getAllStudents(): List<Student> {
        return mockedStudentList
    }

    companion object {
        private val mockedStudentList = listOf(
            Student(1, "Josh Phillips", Timestamp(8762345876345L)),
            Student(2,  "Johnatan Joestar", Timestamp(7778787878887L)),
            Student(3, "Joseph Joestar", Timestamp(8975672561L)),
            Student(4, "Jotaro Kujo", Timestamp(7610L))
        )
    }
}