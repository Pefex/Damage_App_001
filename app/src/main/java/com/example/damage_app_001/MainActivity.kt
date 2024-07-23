package com.example.damage_app_001

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import androidx.room.Room
import com.example.damage_app_001.data.ElementDataBase
import com.example.damage_app_001.domain.ElementsRepository
import com.example.damage_app_001.navigation.NavigationGraph
import com.example.damage_app_001.ui.theme.Damage_App_001Theme
import com.example.damage_app_001.ui_elements.MainViewModel
import com.example.damage_app_001.ui_elements.Mainscreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val db = Room
            .databaseBuilder(applicationContext, ElementDataBase::class.java, "element-db")
            .build()
        // 2. Manual MainViewModel Creation
        val mainViewModel = MainViewModel(ElementsRepository(db.elementsDao()))

        enableEdgeToEdge()
        setContent {
            NavigationGraph(navHostController = rememberNavController())
        }
    }
}

