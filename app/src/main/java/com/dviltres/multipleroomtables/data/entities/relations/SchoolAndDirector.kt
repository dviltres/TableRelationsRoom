package com.dviltres.multipleroomtables.data.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.dviltres.multipleroomtables.data.entities.Director
import com.dviltres.multipleroomtables.data.entities.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)