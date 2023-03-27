package com.github.iaroslavomelianenko.moviesapp.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(text = "Main screen")
    }
}