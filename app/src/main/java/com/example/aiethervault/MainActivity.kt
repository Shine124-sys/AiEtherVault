package com.example.aiethervault

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.aiethervault.Screens.MyApp
import com.example.aiethervault.ui.theme.AiEtherVaultTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AiEtherVaultTheme {
                MyApp()
            }
        }
    }
}

