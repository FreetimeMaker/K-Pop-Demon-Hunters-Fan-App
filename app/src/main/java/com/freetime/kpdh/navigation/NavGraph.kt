package com.freetime.kpdh.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.freetime.kpdh.ui.screens.GalleryScreen
import com.freetime.kpdh.ui.screens.HomeScreen
import com.freetime.kpdh.ui.screens.ProfileScreen

class NavGraph {
}

@Composable
fun AppNavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("gallery") { GalleryScreen(navController) }
        composable("profile/{id}") { backStackEntry ->
            val id = backStackEntry.arguments?.getString("id") ?: ""
            ProfileScreen(id = id, navController)
        }
    }
}