package com.jcisneros.jetpackcomposenavigation.navigation // ktlint-disable filename

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jcisneros.jetpackcomposenavigation.screens.DetailScreen
import com.jcisneros.jetpackcomposenavigation.screens.HomeScreen

@Composable
fun SetUpNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(
                navController = navController
            )
        }
        composable(
            route = Screen.Detail.route
        ) {
            DetailScreen()
        }
    }
}
