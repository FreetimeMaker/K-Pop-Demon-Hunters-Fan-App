package com.freetime.kpdh.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.freetime.kpdh.ui.components.CharacterCard

@Composable
fun HomeScreen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Welcome Demon Hunters 💫", style = MaterialTheme.typography.headlineMedium)
        Spacer(Modifier.height(8.dp))
        CharacterCard("HUNTR/X", "https://your-image-url.com/huntr.png") {
            navController.navigate("profile/huntr")
        }
        CharacterCard("Saja Boys", "https://your-image-url.com/saja.png") {
            navController.navigate("profile/saja")
        }
        Button(onClick = { navController.navigate("gallery") }) {
            Text("Go to Gallery")
        }
    }
}
