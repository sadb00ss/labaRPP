package com.example.labarpp.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Timestamp

@Entity(tableName = "Students")
data class Student(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    val fullName: String,
    val entryAdditionTime: Timestamp
)