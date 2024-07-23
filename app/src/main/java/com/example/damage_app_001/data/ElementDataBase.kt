package com.example.damage_app_001.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ListData::class], version = 1)
abstract class ElementDataBase : RoomDatabase(){
    abstract fun elementsDao() : ElementsDao
}