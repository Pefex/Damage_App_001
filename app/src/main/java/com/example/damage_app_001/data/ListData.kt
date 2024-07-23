package com.example.damage_app_001.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class ListData(
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val title : String = ""
)
