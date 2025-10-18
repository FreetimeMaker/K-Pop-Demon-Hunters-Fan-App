package com.freetime.kpdh.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ProfileScreen(id: String, navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Profile: $id", style = MaterialTheme.typography.headlineMedium)
        Text("Lore, powers, and fan theories go here...")
    }
}
