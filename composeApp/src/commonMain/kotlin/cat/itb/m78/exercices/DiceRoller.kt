package cat.itb.m78.exercices

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ScaleFactor
import androidx.compose.ui.unit.dp
import m78exercices.composeapp.generated.resources.*
import m78exercices.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.painterResource
import kotlin.math.min

@Composable
fun StartDiceRoller() {
    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(Res.drawable.tapestry),
            modifier = Modifier.fillMaxSize().rotate(90.0f),
            contentDescription = null)
    }
}