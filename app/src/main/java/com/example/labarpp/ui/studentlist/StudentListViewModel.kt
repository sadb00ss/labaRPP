package com.example.labarpp.ui.studentlist

import androidx.lifecycle.ViewModel
import com.example.labarpp.domain.Repository

class StudentListViewModel : ViewModel() {
    private val repository = Repository()
    fun getStudents() = repository.getAllStudents()
}