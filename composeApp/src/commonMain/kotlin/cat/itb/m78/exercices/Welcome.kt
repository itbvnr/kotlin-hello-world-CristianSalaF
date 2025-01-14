package cat.itb.m78.exercices

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.PI

@Composable
fun PrintWelcome() {
    //HorizontalArrangement, VerticalArrangement
    Column(modifier = Modifier.fillMaxSize().background(Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text("Welcome!", fontSize = 20.sp)
        Spacer(modifier = Modifier.height(10.dp))
        Text("Start learning now")
        Spacer(modifier = Modifier.height(40.dp))

        Button(onClick = { }) {
            Text("Login",)
        }
        Button(onClick = { }) {
            Text("Register")
        }
    }
}