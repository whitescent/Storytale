package org.jetbrains.compose.storytale.gallery

import androidx.compose.runtime.Composable
import org.jetbrains.compose.storytale.gallery.platform.StoryGallery
import org.jetbrains.compose.storytale.gallery.ui.theme.StoryGalleryTheme
import org.jetbrains.compose.storytale.storiesStorage
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
private fun Gallery() {
  StoryGalleryTheme {
    StoryGallery(storiesStorage)
  }
}
