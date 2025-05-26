package com.example.curriculumdana

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen {
                startActivity(Intent(this, SecondActivity::class.java))
            }
        }
    }
}

@Composable
fun MainScreen(onButtonClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE5C5EF))
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_avatar),
            contentDescription = "Foto de perfil",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(16.dp))
        Text("Dana Pérez Moreno", fontSize = 28.sp, color = Color(0xFF000000))
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            "Soy estudiante de desarrollo de software. " +
                    "Me interesa el diseño web, la programación y crear soluciones útiles.",
            color = Color(0xFF625A5A),
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = onButtonClick) {
            Text("Ver más información")
        }
    }
}