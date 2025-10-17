package com.freetime.kpdh.ui.screens

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
