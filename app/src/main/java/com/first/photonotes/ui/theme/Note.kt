package com.first.photonotes.ui.theme

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class Note(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val imagePath: String,
    val noteText: String

)

