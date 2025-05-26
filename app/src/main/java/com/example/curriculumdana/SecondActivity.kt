package com.example.curriculumdana

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SecondScreen()
        }
    }
}

@Composable
fun SecondScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFF8F3)) // fondo claro pastel
            .padding(horizontal = 24.dp, vertical = 32.dp)
            .verticalScroll(rememberScrollState())
    ) {
        SectionTitle("Estudios", R.drawable.baseline_school_24)
        SectionItem("Estudiante de Desarrollo de Software - Instituto Superior Villa del Rosario")

        SectionTitle("Experiencia", R.drawable.outline_build_24)
        SectionItem("Atención al cliente - Cajera (2017 - 2024)")
        SectionItem("Curso Codo a Codo (2024)")

        SectionTitle("Conocimientos", R.drawable.outline_computer_24)
        SectionItem("HTML, CSS, JavaScript")
        SectionItem("Visual Basic, Visual Studio Code")
        SectionItem("SQL Server")
    }
}

@Composable
fun SectionTitle(title: String, iconId: Int) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp)
    ) {
        Image(
            painter = painterResource(id = iconId),
            contentDescription = null,
            modifier = Modifier
                .size(28.dp)
                .padding(end = 8.dp)
        )
        Text(
            text = title,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF5A047C) // tono naranja suave
        )
    }
}

@Composable
fun SectionItem(content: String) {
    Text(
        text = "• $content",
        fontSize = 16.sp,
        color = Color(0xFF444444),
        modifier = Modifier
            .padding(start = 12.dp, bottom = 10.dp)
    )
}
