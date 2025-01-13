package cat.itb.m78.exercices

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import kotlin.math.PI

@Composable
fun HelloWorldApp() {
    Column {
        Text("Hello World", color = Color.Red, fontStyle =  FontStyle.Italic)
        Column(modifier = Modifier.background(Color.DarkGray)) {
            Text(PI.toString()+PI.toString())
            Spacer(Modifier.height(30.dp))
            Text(PI.toString()+PI.toString())
            Spacer(Modifier.height(30.dp))
            Text(PI.toString()+PI.toString())
            Spacer(Modifier.height(30.dp))
            Text(PI.toString()+PI.toString())
            Spacer(Modifier.height(30.dp))
            Text(PI.toString()+PI.toString())
            Spacer(Modifier.height(30.dp))
        }
        Row {
            Text(PI.toString()+PI.toString())
            Spacer(modifier = Modifier.width(8.dp))
            Text(PI.toString()+PI.toString())
            Spacer(modifier = Modifier.width(8.dp))
            Text(PI.toString()+PI.toString())
            Spacer(modifier = Modifier.width(8.dp))
            Text(PI.toString()+PI.toString())
            Spacer(modifier = Modifier.width(8.dp))
            Text(PI.toString()+PI.toString())
            Spacer(modifier = Modifier.width(8.dp))
        }
        Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
            Text(PI.toString()+PI.toString())
            Spacer(modifier = Modifier.width(8.dp))
        }
    }
}