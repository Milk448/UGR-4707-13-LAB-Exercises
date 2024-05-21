package com.example.jetpackcompose2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose2.ui.theme.JetpackCompose2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompose2Theme {
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
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Count: $count", style = MaterialTheme.typography.h4)

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { count++ }) {
            Text("Increment")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = { count-- }) {
            Text("Decrement")
        }

        SpacerLet's continue with the setup for the second project, `jetpackCompose2`.

        **2. Create `MainActivity.kt` (continued):**

        ```kotlin
        package com.example.jetpackcompose2

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
                import com.example.jetpackcompose2.ui.theme.JetpackCompose2Theme

        class MainActivity : ComponentActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContent {
                    JetpackCompose2Theme {
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
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Count: $count", style = MaterialTheme.typography.h4)

                Spacer(modifier = Modifier.height(16.dp))

                Button(onClick = { count++ }) {
                    Text("Increment")
                }

                Spacer(modifier = Modifier.height(8.dp))

                Button(onClick = { count-- }) {
                    Text("Decrement")
                }

                Spacer(modifier = Modifier.height(8.dp))

                Button(onClick = { count = 0 }) {
                    Text("Reset")
                }
            }
        }

        @Preview(showBackground = true)
        @Composable
        fun DefaultPreview() {
            JetpackCompose2Theme {
                CounterApp()
            }
        }
