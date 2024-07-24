package com.example.damage_app_001.ui_elements

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.damage_app_001.data.BuildingElements
import com.example.damage_app_001.data.Components
import com.example.damage_app_001.data.Elements
import com.example.damage_app_001.data.Floors
import com.example.damage_app_001.data.Property
import com.example.damage_app_001.data.Stairs
import com.example.damage_app_001.domain.PropertyRepository
import kotlinx.coroutines.launch

class MainViewModel(
    val repository: PropertyRepository
) : ViewModel(){

    val propertyList = repository.allPropertiesList
    val stairsList = repository.allStaisList
    val componentList = repository.allComponentsList
    val floorList = repository.allFloorsList
    val elementList = repository.allElementsList
    val buildingElementsList = repository.allBuildingElementsList


    fun insertProperty(data: Property){
        if(data.title.isEmpty()){
            return
        }
        viewModelScope.launch {
            repository.insertProperty(data)
        }
    }

    fun deleteProperty(data: Property){
        viewModelScope.launch {
            repository.deleteProperty(data)
        }
    }

    fun updateProperty(data: Property){
        if(data.title.isEmpty()){
            return
        }
        viewModelScope.launch{
            repository.updateProperty(data)
        }
    }

    fun insertCompoment(data : Components){
        if(data.title.isEmpty()){
            return
        }
        viewModelScope.launch {
            repository.insertComponent(data)
        }
    }

    fun updateComponent(data: Components){
        if(data.title.isEmpty()){
            return
        }
        viewModelScope.launch {
            repository.updateComponent(data)
        }
    }

    fun deleteComponent(data : Components){
        viewModelScope.launch {
            repository.deleteComponent(data)
        }
    }

    fun insertStairs(data: Stairs){
        if(data.title.isEmpty()){
            return
        }
        viewModelScope.launch {
            repository.insertStair(data)
        }
    }

    fun updateStairs(data: Stairs){
        if(data.title.isEmpty()){
            return
        }
        viewModelScope.launch {
            repository.updateStair(data)
        }
    }

    fun deleteStairs(data: Stairs){
        viewModelScope.launch {
            repository.deleteStair(data)
        }
    }

    fun insertFloor(data : Floors){
        if(data.title.isEmpty()){
            return
        }
        viewModelScope.launch {
            repository.insertFloor(data)
        }
    }

    fun updateFloor(data: Floors){
        if(data.title.isEmpty()){
            return
        }
        viewModelScope.launch {
            repository.updateFloor(data)
        }
    }

    fun deleteFloor(data: Floors){
        viewModelScope.launch {
            repository.deleteFloor(data)
        }
    }

    fun insertElement(data: Elements){
        if(data.title.isEmpty()){
            return
        }
        viewModelScope.launch {
            repository.insertElement(data)
        }
    }

    fun updateElement(data: Elements){
        if(data.title.isEmpty()){
            return
        }
        viewModelScope.launch {
            repository.updateElement(data)
        }
    }

    fun deleteElement(data: Elements){
        viewModelScope.launch {
            repository.deleteElement(data)
        }
    }

    fun insertBuildingElement(data: BuildingElements){
        if(data.title.isEmpty()){
            return
        }
        viewModelScope.launch {
            repository.insertBuildingElement(data)
        }
    }

    fun updateBuildingEllement(data: BuildingElements){
        if(data.title.isEmpty()){
            return
        }
        viewModelScope.launch {
            repository.updateBuildingElelement(data)
        }
    }

    fun deleteBuildingElelment(data: BuildingElements){
        viewModelScope.launch {
            repository.deleteBuildingElement(data)
        }
    }
}