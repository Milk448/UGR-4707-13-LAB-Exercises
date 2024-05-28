package com.example.jetpackcompose3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose3.ui.theme.JetpackCompose3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompose3Theme {
                Surface(color = MaterialTheme.colors.background) {
                    GreetingList()
                }
            }
        }
    }
}

@Composable
fun GreetingList() {
    val names = listOf("Android", "Compose", "World")
    Column(modifier = Modifier.padding(16.dp)) {
        for (name in names) {
            Greeting(name)
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello, $name!", style = MaterialTheme.typography.h4)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackCompose3Theme {
        GreetingList()
    }
}
