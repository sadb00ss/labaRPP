package com.example.labarpp.db

import java.sql.Timestamp

data class Student(
    val id: Int,
    val fullName: String,
    val entryAdditionTime: Timestamp
)