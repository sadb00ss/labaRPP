package com.example.labarpp.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface StudentsDao {

    @Query("DELETE FROM Students")
    fun clearStudents()

    @Insert
    fun addStudent(student: Student)

    @Insert
    fun addStudents(students: List<Student>)

    @Query("UPDATE Students SET fullName = :fullName WHERE id = LAST_INSERT_ID()")
    fun changeFullName(fullName: String)

}