package com.example.labarpp.db

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.labarpp.App
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized


@Database(entities = [Student::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract val studentsDao: StudentsDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase?  = null

        @InternalCoroutinesApi
        fun getDatabase(): AppDatabase {
            val tempInstance = INSTANCE

            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    App.context,
                    AppDatabase::class.java,
                    "rpp_database")
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }


}