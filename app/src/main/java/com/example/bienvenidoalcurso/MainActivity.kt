package com.example.bienvenidoalcurso

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
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
import com.example.bienvenidoalcurso.ui.theme.BienvenidoAlCursoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BienvenidoAlCursoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFDFF5DC) // fondo verde claro
                ) {
                    TarjetaDePresentacion()
                }
            }
        }
    }
}

@Composable
fun TarjetaDePresentacion() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(250.dp))

            Image(
                painter = painterResource(id = R.drawable.ic_android_black_24dp),
                contentDescription = "Logo Android",
                modifier = Modifier.size(120.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Jennifer Doe",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF004D40)
            )

            Text(
                text = "Android Developer Extraordinaire",
                fontSize = 16.sp,
                color = Color(0xFF004D40)
            )
        }

        // ---------- Sección inferior (contactos) ----------
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp)
        ) {
            FilaContacto(R.drawable.baseline_phone_android_24, "+11 (123) 444 555 666")
            FilaContacto(R.drawable.baseline_share_24, "@AndroidDev")
            FilaContacto(R.drawable.baseline_email_24, "jen.doe@android.com")
        }
    }
}

@Composable
fun FilaContacto(icono: Int, texto: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = icono),
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = texto, fontSize = 16.sp, color = Color.Black)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTarjeta() {
    BienvenidoAlCursoTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFFDFF5DC)
        ) {
            TarjetaDePresentacion()
        }
    }
}
