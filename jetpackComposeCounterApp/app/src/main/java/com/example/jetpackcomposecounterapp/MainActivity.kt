package com.example.jetpackcomposecounterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecounterapp.ui.theme.JetpackComposeCounterAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeCounterAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    CounterApp()
                }
            }
        }
    }
}

@Composable
fun CounterApp() {
    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Count: $count", style = MaterialTheme.typography.h4)

        Spacer(modifier = Modifier.height(16.dp))

        Row {
            Button(onClick = { count++ }, modifier = Modifier.padding(8.dp)) {
                Text("Increment")
            }
            Button(onClick = { count-- }, modifier = Modifier.padding(8.dp)) {
                Text("Decrement")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { count = 0 }, modifier = Modifier.padding(8.dp)) {
            Text("Reset")
        }
    }
}
