package cat.itb.m78.exercices

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import m78exercices.composeapp.generated.resources.Res
import m78exercices.composeapp.generated.resources.generatedFace
import org.jetbrains.compose.resources.Resource
import org.jetbrains.compose.resources.painterResource

@Composable
fun PrintResource() {
    //HorizontalArrangement, VerticalArrangement
    Column(modifier = Modifier.fillMaxSize().background(Color.Gray)) {

        Text("This is a resource string", fontSize = 30.sp)
        Image(
            painter = painterResource(Res.drawable.generatedFace),
            modifier = Modifier.size(256.dp).padding(20.dp),
            contentDescription = null)
    }
}