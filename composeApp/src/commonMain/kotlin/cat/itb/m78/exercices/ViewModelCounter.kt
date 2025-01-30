package cat.itb.m78.exercices

import androidx.compose.material3.Button
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import m78exercices.composeapp.generated.resources.*

class TeamsScoreView : ViewModel() {
    val score = listOf(mutableStateOf(0), mutableStateOf(0))
    fun addScore(i : Int){
        score[i].value ++
    }
}

@Composable
fun StartViewModelCounter() {
    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }

    val diceRes = listOf(Res.drawable.dice_1, Res.drawable.dice_2, Res.drawable.dice_3, Res.drawable.dice_4, Res.drawable.dice_5, Res.drawable.dice_6)
    val scoreOne = remember { mutableStateOf(1)} //diceOne.value
    val scoreTwo = remember { mutableStateOf(1)}

    val viewModel = viewModel { TeamsScoreView() }
    Button(
        onClick =  { viewModel.addScore(1) }
    ) {
        Text("Score")
    }

    /*Scaffold(
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
    }*/
}
