package com.example.navigation.navegacao

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navigation.views.Content
import com.example.navigation.views.DetailView
import com.example.navigation.views.HomeView

@Composable
fun NavManager() {
    val darkMode = remember { mutableStateOf(false) }
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home"){
        composable("Home"){
            HomeView(navController)
        }
        composable("Detail/{id}/?{opcional}", arguments = listOf(
            navArgument("id"){ type = NavType.IntType },
            navArgument("opcional"){ type = NavType.StringType },
        )){
            val id = it.arguments?.getInt("id") ?: 0
            val opcional = it.arguments?.getString("opcional") ?: ""
            DetailView(navController, id, opcional)
        }
        composable("Botoes"){
            Content(darkMode = darkMode, navController = navController)
        }
    }
}