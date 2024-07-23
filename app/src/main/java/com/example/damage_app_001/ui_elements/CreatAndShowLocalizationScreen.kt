package com.example.damage_app_001.ui_elements

import CustomizeDropDown
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import java.util.Collections.list


@Composable
fun CreateAndShowLocalizationScreen(){

    //for level 1  the user must joose between
    val optionsLevel1 = listOf("component 1", "comment 2", "component 3", "component 4", "component 5", "component 6", "component 7")
    //for optionLevel1outside
    //val optionLevelinside = list("2")
    // for level 2
    //val list("2") = listOf("stairs 1", "stairs 2", "stairs 3", "stairs 4", "stairs 5", "stairs 6", "stairs 7")
    //for level 3
    val optionsLevel3 = listOf("1 st floor", "2 st floor", "3 st floor", "4 st floor", "5 st floor", "6 st floor", "7 st floor", "basement")
    // for level 4
    val optionsLevel4 = listOf("component 1", "comment 2", "component 3", "component 4", "component 5", "component 6", "component 7")
    // for level buildingElements
    val optionsBuildingElements = listOf("wall", "", "component 3", "component 4", "component 5", "component 6", "component 7")



    Column (modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)){

       CustomizeDropDown(optionsLevel1)
    }
}