package com.example.compose_migration

import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainFragmentScreen() {
    Box {
        Text(text = "Prueba Fragment COMPOSE desde SCREEN")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainFragmentScreen() {
    MainFragmentScreen()
}