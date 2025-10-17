package com.freetime.kpdh.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class CharacterCard {
}

@Composable
fun CharacterCard(name: String, imageUrl: String, onClick: () -> Unit) {
    Card(modifier = Modifier.fillMaxWidth().padding(8.dp).clickable { onClick() }) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            AsyncImage(model = imageUrl, contentDescription = name, modifier = Modifier.size(80.dp))
            Text(name, modifier = Modifier.padding(8.dp), style = MaterialTheme.typography.titleMedium)
        }
    }
}
