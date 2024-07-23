package com.example.damage_app_001.ui_elements

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.damage_app_001.data.Property
import com.example.damage_app_001.domain.PropertyRepository
import kotlinx.coroutines.launch

class MainViewModel(
    val repository: PropertyRepository
) : ViewModel(){

    val data = repository.allData


    fun insert(data: Property){
        viewModelScope.launch {
            repository.insertProperty(data)
        }
    }

    fun delete(data: Property){
        viewModelScope.launch {
            repository.deleteProperty(data)
        }
    }
}