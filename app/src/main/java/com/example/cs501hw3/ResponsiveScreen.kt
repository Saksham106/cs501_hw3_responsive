package com.example.cs501hw3

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ResponsiveScreen(modifier: Modifier = Modifier) {
    val options = listOf("Overview", "Schedule", "Assignments", "Grades", "Settings")
    var selected by remember { mutableStateOf(options[0]) }

    BoxWithConstraints(modifier = modifier.fillMaxSize()) {
        val isWide = maxWidth >= 600.dp

        if (!isWide) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Text("Responsive Screen", style = MaterialTheme.typography.titleLarge)
                HorizontalDivider(modifier = Modifier.padding(vertical = 12.dp))

                Text("Selected: $selected", style = MaterialTheme.typography.titleMedium)
                HorizontalDivider(modifier = Modifier.padding(vertical = 12.dp))

                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(options) { item ->
                        ListItem(
                            headlineContent = { Text(item) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { selected = item }
                        )
                    }
                }

                Button(
                    onClick = { selected = options[0] },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text("Reset Selection")
                }
            }
        } else {
            Row(modifier = Modifier.fillMaxSize()) {

                Surface(
                    modifier = Modifier
                        .weight(0.35f)
                        .fillMaxHeight(),
                    tonalElevation = 2.dp
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("Menu", style = MaterialTheme.typography.titleLarge)
                        HorizontalDivider(modifier = Modifier.padding(vertical = 12.dp))

                        LazyColumn(
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            items(options) { item ->
                                ListItem(
                                    headlineContent = { Text(item) },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable { selected = item }
                                )
                            }
                        }
                    }
                }

                Box(
                    modifier = Modifier
                        .weight(0.65f)
                        .fillMaxHeight()
                        .padding(16.dp),
                    contentAlignment = Alignment.TopStart
                ) {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Text("Details", style = MaterialTheme.typography.titleLarge)
                        HorizontalDivider(modifier = Modifier.padding(vertical = 12.dp))

                        Card(modifier = Modifier.fillMaxWidth()) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text(
                                    "Selected: $selected",
                                    style = MaterialTheme.typography.titleMedium
                                )
                                Text(
                                    text = "This pane changes when you tap items on the left.",
                                    modifier = Modifier.padding(top = 8.dp)
                                )

                                Button(
                                    onClick = { selected = options[0] },
                                    modifier = Modifier.padding(top = 16.dp)
                                ) {
                                    Text("Reset Selection")
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
