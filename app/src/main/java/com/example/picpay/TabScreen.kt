package com.example.picpay

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Tab
import androidx.compose.material.TabPosition
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.Text
import androidx.compose.material.primarySurface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.UiComposable
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun TabScreen() {
    var tabIndex by remember { mutableIntStateOf(0) }

    val tabs = listOf("Home", "About", "Settings")

    Column(modifier = Modifier.fillMaxWidth()) {
        TabRow(selectedTabIndex = tabIndex) {
            tabs.forEachIndexed { index, title ->
                Tab(text = { Text(title) },
                    selected = tabIndex == index,
                    onClick = { tabIndex = index }
                )
            }
        }
        when (tabIndex) {
            0 -> ProfileImageTab()
        }
    }
}

@Composable
@UiComposable
fun TabRow(
    selectedTabIndex: Int,
    modifier: Modifier = Modifier,
    backgroundColor: Color = MaterialTheme.colors.primarySurface,
    indicator: @Composable @UiComposable (tabPositions: List<TabPosition>) -> Unit = @Composable { tabPositions ->
        TabRowDefaults.Indicator(
            Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex])
        )
    },
    divider: @Composable @UiComposable () -> Unit = @Composable {
        TabRowDefaults.Divider()
    },
    tabs: @Composable @UiComposable () -> Unit
): Unit {

}

@Composable
fun ProfileImageTab() {
    Image(
        painter = painterResource(id = R.drawable.avatar),
        contentDescription = "Melhor de todos os tempos",
        Modifier
            .size(40.dp)
            .clip(CircleShape)
            .border(
                1.8.dp,
                androidx.compose.material3.MaterialTheme.colorScheme.secondary,
                CircleShape
            )
    )
}