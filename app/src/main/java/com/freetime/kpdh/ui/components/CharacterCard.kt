package com.freetime.kpdh.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

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
