package com.dviltres.multipleroomtables.data.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.dviltres.multipleroomtables.data.entities.School
import com.dviltres.multipleroomtables.data.entities.Student

data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students: List<Student>
)