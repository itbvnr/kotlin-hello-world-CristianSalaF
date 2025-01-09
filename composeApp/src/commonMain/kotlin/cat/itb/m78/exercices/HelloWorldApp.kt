package cat.itb.m78.exercices

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight

@Composable
fun HelloWorldApp() {
    Text("Hello World", color = Color.Red, fontStyle =  FontStyle.Italic)
}