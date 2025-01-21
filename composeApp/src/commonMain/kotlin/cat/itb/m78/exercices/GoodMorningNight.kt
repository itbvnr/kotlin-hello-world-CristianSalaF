package cat.itb.m78.exercices

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun GoodMorningNight() {
    Column() {
        val message = remember { mutableStateOf("Good !?") }

        Text(message.value);

        Button(onClick = { message.value  = "Good Morning"}){
            Text("Morning")
        }

        Button(onClick = { message.value  = "Good Night"}){
            Text("Night")
        }
    }
}