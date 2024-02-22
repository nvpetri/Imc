package br.senai.sp.imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.imc.ui.theme.ImcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImcTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
        modifier = Modifier
            .height(200.dp)
            .fillMaxWidth()
            .background(color = Color.Red)
            .padding(top = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(painterResource(id = R.drawable.bmi), contentDescription = "")
        Text(
            text = "Calculadora IMC",
            fontSize = 32.sp,
            modifier = Modifier.padding(top = 8.dp),
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

    }
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .height(600.dp)
                .width(340.dp)
                .padding(top = 176.dp, start = 50.dp)
                .background(
                    color = Color(0xFFECECEC),
                    shape = RoundedCornerShape(
                        topStart = 20.dp,
                        bottomEnd = 20.dp,
                        topEnd = 20.dp,
                        bottomStart = 20.dp
                    )
                )
        ) {
            Text(
                text = "Seus dados",
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp,
                color = Color.Red,
                modifier = Modifier
                    .padding(top = 32.dp)
            )
            Text(
                text ="Seu peso"
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ImcTheme {
        Greeting()
    }
}