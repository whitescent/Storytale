package org.jetbrains.compose.storytale.gallery.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

actual object ScreenSize {
  actual val width: Dp
    @Composable get() = LocalWindowInfo.current.containerSize.width.dp

  actual val height: Dp
    @Composable get() = LocalWindowInfo.current.containerSize.height.dp
}
