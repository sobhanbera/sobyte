package com.sobhanbera.noisymelo.sobyte.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sobhanbera.noisymelo.sobyte.configs.DEVICE_STATUS_BAR_HEIGHT

data class Gutters (
	val extraTiny: Dp = 2.dp,
	val tiny: Dp = 5.dp,
	val small: Dp = 10.dp,
	val regular: Dp = 15.dp,
	val medium: Dp = 20.dp,
	val large: Dp = 26.dp,
	val extraLarge: Dp = 32.dp,
	val massive: Dp = 5.dp * 4 * 5, // 100
	val huge: Dp = 3.dp * 5 * 5 * 2, // 150

	val statusBarHeight: Dp = DEVICE_STATUS_BAR_HEIGHT.dp, // this special key contains the value of status bar's height
)

val LocalGutters = compositionLocalOf { Gutters() }

val MaterialTheme.gutters: Gutters
	@Composable
	@ReadOnlyComposable
	get() = LocalGutters.current
