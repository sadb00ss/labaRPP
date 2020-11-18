package com.example.labarpp.ui.studentlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.labarpp.R
import com.example.labarpp.db.Student
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_student.view.*


class StudentsListAdapter : RecyclerView.Adapter<StudentsListAdapter.ViewHolder>() {

    private var dataSet = listOf<Student>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.item_student, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(dataSet[position])
    }

    class ViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {
        fun bind(student: Student) {
            containerView.textId.text = student.id.toString().addPrefix(R.string.id)
            containerView.fullName.text = student.fullName.addPrefix(R.string.name)
            containerView.date.text = student.entryAdditionTime.toString().addPrefix(R.string.date)
        }
        private fun String.addPrefix(stringId: Int): String {
            return containerView.context.resources.getString(stringId, this)
        }
    }

    override fun getItemCount() = dataSet.size

    fun setStudents(dataSet: List<Student>) {
        this.dataSet = dataSet
        notifyDataSetChanged()
    }



}