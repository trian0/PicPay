package com.example.picpay

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.picpay.screens.Home
import com.example.picpay.screens.Notifications
import com.example.picpay.screens.Shop
import com.example.picpay.screens.Wallet

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            Home()
        }
        composable(route = BottomBarScreen.Wallet.route) {
            Wallet()
        }
        composable(route = BottomBarScreen.Notifications.route) {
            Notifications()
        }
        composable(route = BottomBarScreen.Shop.route) {
            Shop()
        }
    }
}