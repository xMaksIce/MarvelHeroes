package com.example.marvelheroes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.marvelheroes.ui.theme.MarvelHeroesTheme
import com.example.marvelheroes.ui.screens.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            MarvelHeroesTheme {
                NavHost(navController = navController, startDestination = "home") {
                    composable("home") { Home(navController)}
                    composable("green goblin") { GreenGoblin(navController) }
                    composable("kraven") { Kraven(navController) }
                    composable("electro") { Electro(navController) }
                }
            }
        }
    }
}
