package cat.itb.m78.exercices

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ScaleFactor
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import m78exercices.composeapp.generated.resources.*
import m78exercices.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.painterResource
import kotlin.math.min
import kotlin.random.Random

@Composable
fun StartDiceRoller() {
    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }

    val diceRes = listOf(Res.drawable.dice_1, Res.drawable.dice_2, Res.drawable.dice_3, Res.drawable.dice_4, Res.drawable.dice_5, Res.drawable.dice_6)
    val diceOne = remember { mutableStateOf(1)} //diceOne.value
    val diceTwo = remember { mutableStateOf(1)}

    Scaffold(
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState)
        },
    ){ padding ->
        Box(modifier = Modifier.fillMaxSize()){
            Image(
                painter = painterResource(Res.drawable.tapestry),
                modifier = Modifier.fillMaxSize().rotate(90.0f),
                contentDescription = null
            )

            Column(modifier = Modifier.align(Alignment.Center), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                Image(
                    painter = painterResource(Res.drawable.title),
                    alignment = Alignment.Center,
                    contentDescription = null
                )

                Button(modifier = Modifier.padding(padding), onClick = {
                    diceOne.value = Random.nextInt(0, 6)
                    diceTwo.value = Random.nextInt(0, 6)

                    if (diceOne.value == 6 && diceTwo.value == 6) {
                        scope.launch {
                            snackbarHostState.showSnackbar("Jackpot!")
                        }
                    }
                }){
                    Text("Roll the dice")
                }
                Row(modifier = Modifier.padding(padding), verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(diceRes[diceOne.value]),
                        alignment = Alignment.Center,
                        contentDescription = null)
                    Image(
                        painter = painterResource(diceRes[diceTwo.value]),
                        alignment = Alignment.Center,
                        contentDescription = null)
                }
            }
        }
    }
}
