package com.example.picpay

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector,
) {
    object Home: BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )
    object Wallet: BottomBarScreen(
        route = "wallet",
        title = "Wallet",
        icon = Icons.Default.Star
    )
    object Notifications: BottomBarScreen(
        route = "notifications",
        title = "Notifications",
        icon = Icons.Default.Notifications
    )
    object Shop: BottomBarScreen(
        route = "shop",
        title = "Shop",
        icon = Icons.Default.ShoppingCart
    )
}
