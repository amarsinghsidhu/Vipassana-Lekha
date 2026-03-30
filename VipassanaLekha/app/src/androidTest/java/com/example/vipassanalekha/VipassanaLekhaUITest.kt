package com.example.vipassanalekha

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.example.vipassanalekha.ui.theme.VipassanaLekhaTheme
import org.junit.Rule
import org.junit.Test

class VipassanaLekhaUITest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun render_vipassana_lekha0() {
        composeTestRule.setContent {
            VipassanaLekhaTheme {
                var vipassanaLekha by remember { mutableStateOf(vipassanaLekha0) }

                Render(vipassanaLekha)

                previousButton = { vipassanaLekha = touchHandling(vipassanaLekha, "previous") }
                nextButton = { vipassanaLekha = touchHandling(vipassanaLekha, "next") }
            }
        }
        composeTestRule.onNodeWithContentDescription("Logo").assertIsDisplayed()
    }

    @Test
    fun render_vipassana_lekha1() {
        composeTestRule.setContent {
            VipassanaLekhaTheme {
                var vipassanaLekha by remember { mutableStateOf(vipassanaLekha1) }

                Render(vipassanaLekha)

                previousButton = { vipassanaLekha = touchHandling(vipassanaLekha, "previous") }
                nextButton = { vipassanaLekha = touchHandling(vipassanaLekha, "next") }
            }
        }
        composeTestRule.onNodeWithContentDescription(
            label = "ਜ਼ਿਆਦਾ ਇਛਾਵਾਂ",
            substring = true
        ).assertIsDisplayed()
    }

    @Test
    fun render_vipassana_lekha2() {
        composeTestRule.setContent {
            VipassanaLekhaTheme {
                var vipassanaLekha by remember { mutableStateOf(vipassanaLekha2) }

                Render(vipassanaLekha)

                previousButton = { vipassanaLekha = touchHandling(vipassanaLekha, "previous") }
                nextButton = { vipassanaLekha = touchHandling(vipassanaLekha, "next") }
            }
        }
        composeTestRule.onNodeWithContentDescription(
            label = "ਸਰਬੱਤ ਦੀ ਭਲਾਈ ਅਤੇ ਖੁਸ਼ੀ",
            substring = true
        ).assertIsDisplayed()
    }

    @Test
    fun render_vipassana_lekha3() {
        composeTestRule.setContent {
            VipassanaLekhaTheme {
                var vipassanaLekha by remember { mutableStateOf(vipassanaLekha3) }

                Render(vipassanaLekha)

                previousButton = { vipassanaLekha = touchHandling(vipassanaLekha, "previous") }
                nextButton = { vipassanaLekha = touchHandling(vipassanaLekha, "next") }
            }
        }
        composeTestRule.onNodeWithContentDescription(
            label = "ओघतरणसुत्तं",
            substring = true
        ).assertIsDisplayed()
    }

    @Test
    fun render_vipassana_lekha4() {
        composeTestRule.setContent {
            VipassanaLekhaTheme {
                var vipassanaLekha by remember { mutableStateOf(vipassanaLekha4) }

                Render(vipassanaLekha)

                previousButton = { vipassanaLekha = touchHandling(vipassanaLekha, "previous") }
                nextButton = { vipassanaLekha = touchHandling(vipassanaLekha, "next") }
            }
        }
        composeTestRule.onNodeWithContentDescription(
            label = "loving-kindness",
            substring = true
        ).assertIsDisplayed()
    }

    @Test
    fun render_vipassana_lekha5() {
        composeTestRule.setContent {
            VipassanaLekhaTheme {
                var vipassanaLekha by remember { mutableStateOf(vipassanaLekha5) }

                Render(vipassanaLekha)

                previousButton = { vipassanaLekha = touchHandling(vipassanaLekha, "previous") }
                nextButton = { vipassanaLekha = touchHandling(vipassanaLekha, "next") }
            }
        }
        composeTestRule.onNodeWithContentDescription(
            label = "complexities overhead",
            substring = true
        ).assertIsDisplayed()
    }

    @Test
    fun render_vipassana_lekha6() {
        composeTestRule.setContent {
            VipassanaLekhaTheme {
                var vipassanaLekha by remember { mutableStateOf(vipassanaLekha6) }

                Render(vipassanaLekha)

                previousButton = { vipassanaLekha = touchHandling(vipassanaLekha, "previous") }
                nextButton = { vipassanaLekha = touchHandling(vipassanaLekha, "next") }
            }
        }
        composeTestRule.onNodeWithContentDescription(
            label = "ਭਾਵ ਤ੍ਰਿਸ਼ਨਾ ਦੇ ਕਾਰਨ ਹੀ ਨੇਕੀ ਦੀ ਕਮਾਈ ਦੇ ਨਤੀਜੇ ਦੀ ਲਾਲਸ",
            substring = true
        ).assertIsDisplayed()
    }

    @Test
    fun render_vipassana_lekha7() {
        composeTestRule.setContent {
            VipassanaLekhaTheme {
                var vipassanaLekha by remember { mutableStateOf(vipassanaLekha7) }

                Render(vipassanaLekha)

                previousButton = { vipassanaLekha = touchHandling(vipassanaLekha, "previous") }
                nextButton = { vipassanaLekha = touchHandling(vipassanaLekha, "next") }
            }
        }
        composeTestRule.onNodeWithContentDescription(
            label = "ਕੁਝ ਸਮਾਨ ਹੀ ਹਰ ਪ੍ਰਣਾਲੀ ਦੇ ਸੰਦਰਭ ਵਿੱਚ",
            substring = true
        ).assertIsDisplayed()
    }
    //End of function Render Test

    //Start of function touchHandling() Tests
    @Test
    fun vipassanaLekha_prev_button_action() {
        composeTestRule.setContent {
            VipassanaLekhaTheme {
                BigBang()
            }
        }

        composeTestRule.onNodeWithContentDescription("Logo").assertIsDisplayed()
        composeTestRule.onNodeWithText("Previous").performClick()
        composeTestRule.onNodeWithContentDescription(
            label = "ਕੁਝ ਸਮਾਨ ਹੀ ਹਰ ਪ੍ਰਣਾਲੀ ਦੇ ਸੰਦਰਭ ਵਿੱਚ",
            substring = true
        ).assertIsDisplayed()


    }

    @Test
    fun vipassanaLekha_next_button_action() {
        composeTestRule.setContent {
            VipassanaLekhaTheme {
                BigBang()
            }
        }
        composeTestRule.onNodeWithContentDescription("Logo").assertIsDisplayed()
        composeTestRule.onNodeWithText("Next").performClick()
        composeTestRule.onNodeWithContentDescription(
            label = "ਜ਼ਿਆਦਾ ਇਛਾਵਾਂ",
            substring = true
        ).assertIsDisplayed()
    }
    // End of function touchHandling() tests

}