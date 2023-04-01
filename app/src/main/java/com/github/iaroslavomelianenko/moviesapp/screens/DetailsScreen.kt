package com.github.iaroslavomelianenko.moviesapp.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.github.iaroslavomelianenko.moviesapp.MainViewModel


@Composable
fun DetailsScreen(navController: NavHostController, viewModel: MainViewModel, itemId: String) {
        Text("Details screen: item id: ${itemId}")
}