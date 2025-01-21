package cat.itb.m78.exercices

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*

@Composable
fun SayHelloScreen(){
    Column {
        var showDialog by remember { mutableStateOf(false) }
        var text by remember { mutableStateOf("") }
        TextField(text,
            label = { Text("Introdueix el teu nom") },
            onValueChange = {
                text = it
            })

        Button(onClick = { showDialog  = true}){
            Text("SayHello")
        }

        if(showDialog)
            AlertDialog(
                onDismissRequest={showDialog = false},
                confirmButton={},
                text = {Text("Hello " + text)}
            )
    }
}