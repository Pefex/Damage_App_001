package com.example.damage_app_001.domain

import com.example.damage_app_001.data.ElementsDao
import com.example.damage_app_001.data.ListData
import kotlinx.coroutines.flow.Flow

class ElementsRepository(val elementsDao: ElementsDao) {
    val allData: Flow<List<ListData>> = elementsDao.getAllData()

    // 3. Data Modification Methods
    suspend fun insert(data: ListData) {
        elementsDao.insert(data)
    }

    suspend fun delete(data: ListData) {
        elementsDao.delete(data)
    }
}