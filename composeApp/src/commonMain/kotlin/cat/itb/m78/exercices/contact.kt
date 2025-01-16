package cat.itb.m78.exercices

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import m78exercices.composeapp.generated.resources.Res
import m78exercices.composeapp.generated.resources.generatedFace
import org.jetbrains.compose.resources.painterResource

data class Contact(val fullName: String, val email: String, val phone: String)
val contact = Contact("Marta Casserres", "marta@example.com", "934578484")


@Composable
fun PrintContact() {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Image(
            painter = painterResource(Res.drawable.generatedFace),
            modifier = Modifier.size(128.dp).padding(10.dp).clip(CircleShape),
            contentDescription = null)

        Text(contact.fullName, fontSize = 25.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(20.dp))

        Box(modifier = Modifier.padding(10.dp).clip(RoundedCornerShape(percent = 10)).background(Color.LightGray).padding(20.dp)) {
            Column(horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center){
                Text("✉ "+contact.email, fontSize = 15.sp)
                Text("📞 "+contact.phone, fontSize = 15.sp)
            }
        }
    }
}

/*
int unicode = 0x1F60A;

public String getEmojiByUnicode(int unicode){
    return new String(Character.toChars(unicode));
}
*/