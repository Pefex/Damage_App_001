package com.example.damage_app_001.ui_elements

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.damage_app_001.data.ListData
import com.example.damage_app_001.domain.ElementsRepository
import kotlinx.coroutines.launch

class MainViewModel(
    val repository: ElementsRepository
) : ViewModel(){

    val data = repository.allData


    fun insert(data: ListData){
        viewModelScope.launch {
            repository.insert(data)
        }
    }

    fun delete(data: ListData){
        viewModelScope.launch {
            repository.delete(data)
        }
    }
}