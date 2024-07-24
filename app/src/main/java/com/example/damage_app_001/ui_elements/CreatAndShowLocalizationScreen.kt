package com.example.damage_app_001.ui_elements

import CustomizeDropDown
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.damage_app_001.data.Property
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList
import java.util.Collections.list


@Composable
fun CreateAndShowLocalizationScreen(
     viewModel: MainViewModel
){

    val title = remember{
        mutableStateOf("")
    }

    val propertyList = viewModel.propertyList.collectAsState(initial = emptyList() )
    val propertyNames = propertyList.value.map { it.title }





    Column (modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)){
        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            CustomizeDropDown(options = propertyNames, value = title.value, onValueChange = {title.value = it})
            Button(onClick = {
                val property = Property(title = title.value)
                viewModel.insertProperty(property)}) {
                Text(text = "Add")

            }


        }


    }
}