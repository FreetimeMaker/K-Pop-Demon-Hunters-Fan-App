package com.freetime.kpdh.ui.screens

class ProfileScreen {
}

@Composable
fun ProfileScreen(id: String, navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Profile: $id", style = MaterialTheme.typography.headlineMedium)
        Text("Lore, powers, and fan theories go here...")
    }
}
