package com.freetime.kpdh.ui.screens

class HomeScreen {
}

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
