package com.example.damage_app_001.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface ElementsDao {
    @Query("SELECT * FROM ListData")
    fun getAllData(): Flow<List<ListData>>

    // 3. Insert Operation for Adding or Updating Items
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(data: ListData)


    @Delete
    suspend fun delete(data: ListData)
}