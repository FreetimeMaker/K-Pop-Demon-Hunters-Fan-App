package com.freetime.kpdh.ui.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage

class GalleryScreen {
}

@Composable
fun GalleryScreen(navController: NavController) {
    LazyColumn {
        items(listOf("https://your-image-url.com/fanart1.png", "https://your-image-url.com/fanart2.png")) { url ->
            AsyncImage(model = url, contentDescription = null, modifier = Modifier.fillMaxWidth().height(200.dp))
            Spacer(Modifier.height(8.dp))
        }
    }
}
