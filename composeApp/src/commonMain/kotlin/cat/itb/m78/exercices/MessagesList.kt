package cat.itb.m78.exercices

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

data class Message(val author: String, val body: String)

val names = listOf(
    "Ellison Curry",
    "Briggs Willis",
    "Alexa Murphy",
    "Cameron Berry",
    "Annabelle Villarreal",
    "Nikolai Wiley",
    "Lauryn Morrow",
    "Kyree Hardy",
    "Jessica Lang",
    "Wells Wilson",
    "Luna Foster",
    "Kayden Taylor",
    "Sofia Mann",
    "Nehemiah Randall",
    "Christina Gordon",
    "Karter Kramer",
    "Hanna Morales",
    "Aaron Velez",
    "Megan Delarosa",
    "Osiris Johnson",
    "Emma Atkins",
    "Cason McKee",
    "Kori Walls",
    "Larry Shepherd",
)
val body = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In ac vestibulum nunc."
val messages = List(100){
    Message(names.random(), body)
}

@Composable
fun PrintMessageList() {
    LazyColumn(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        messages.forEach { message -> item {
            Column(modifier = Modifier.width(350.dp).clip(shape = RoundedCornerShape(20.dp)).background(Color.LightGray).padding(16.dp)) {
                Text(message.author)
                Spacer(Modifier.height(16.dp))
                Text(message.body)
                }
            Spacer(Modifier.height(32.dp))
            /*Scaffold(
            topBar = {
                TopAppBar(
                title = {Text("title")},
                navigationIcon = {Icon(Icons.AutoMirrored.Filled.ArrowBack, "back")}),

            }floatingActionButton = {
                FloatingActionButton(onClick = {}){
                Icon(Icons.Default.Add, "add")
                }
            })*/
            }
        }
    }
}