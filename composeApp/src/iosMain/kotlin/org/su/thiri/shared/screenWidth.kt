package org.su.thiri.shared

import androidx.compose.runtime.Composable

@Composable
@OptIn(ExperimentalComposeUiApi::class)
actual fun screenWidth(): Int  {
    return LocalWindowInfo.current.containerSize.width
}