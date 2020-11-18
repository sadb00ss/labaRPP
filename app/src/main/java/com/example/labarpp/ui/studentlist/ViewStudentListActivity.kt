package com.example.labarpp.ui.studentlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.labarpp.R
import kotlinx.android.synthetic.main.activity_view_student_list.*

class ViewStudentListActivity : AppCompatActivity() {

    private lateinit var  viewModel: StudentListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_student_list)

        viewModel = ViewModelProvider(this).get(StudentListViewModel::class.java)

        val adapter = StudentsListAdapter()
        studentsRecyclerView.layoutManager = LinearLayoutManager(this)
        studentsRecyclerView.adapter = adapter
        val students = viewModel.getStudents()
        adapter.setStudents(students)
    }
}