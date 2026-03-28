package com.example.vipassanalekha

import androidx.compose.foundation.layout.Column
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
                BigBang()
            }
        }
        composeTestRule.onNodeWithContentDescription("Logo").assertIsDisplayed()
        composeTestRule.onNodeWithText("Vipassana Anubhava").assertIsDisplayed()
        composeTestRule.onNodeWithText("Amar").assertIsDisplayed()
        composeTestRule.onNodeWithText("2026").assertIsDisplayed()
    }

    @Test
    fun render_vipassana_lekha1() {
        composeTestRule.setContent {
            VipassanaLekhaTheme {
                Column{
                    Render(vipassanaLekha1)
                    TouchHandling(
                        vipassanaLekha = vipassanaLekha1,
                        onButtonClick = {
                                nextVipassanaLekha ->
                            vipassanaLekha1 = nextVipassanaLekha
                        }
                    )
                }
            }
        }
        composeTestRule.onNodeWithContentDescription(
            label = "ਜ਼ਿਆਦਾ ਇਛਾਵਾਂ",
            substring = true
        ).assertIsDisplayed()
		composeTestRule.onNodeWithText("Monkey Mind").assertIsDisplayed()
		composeTestRule.onNodeWithText("Amar").assertIsDisplayed()
		composeTestRule.onNodeWithText("2026").assertIsDisplayed()
	}

    @Test
    fun render_vipassana_lekha2() {
        composeTestRule.setContent {
            VipassanaLekhaTheme {
                Column{
                    Render(vipassanaLekha2)
                    TouchHandling(
                        vipassanaLekha = vipassanaLekha2,
                        onButtonClick = {
                                nextVipassanaLekha ->
                            vipassanaLekha2 = nextVipassanaLekha
                        }
                    )
                }
            }
        }
        composeTestRule.onNodeWithContentDescription(
            label = "ਸਰਬੱਤ ਦੀ ਭਲਾਈ ਅਤੇ ਖੁਸ਼ੀ",
            substring = true
        ).assertIsDisplayed()
		composeTestRule.onNodeWithText("Monkey Mind").assertIsDisplayed()
		composeTestRule.onNodeWithText("Amar").assertIsDisplayed()
		composeTestRule.onNodeWithText("2026").assertIsDisplayed()
	}

    @Test
    fun render_vipassana_lekha3() {
        composeTestRule.setContent {
            VipassanaLekhaTheme {
                Column{
                    Render(vipassanaLekha3)
                    TouchHandling(
                        vipassanaLekha = vipassanaLekha3,
                        onButtonClick = {
                                nextVipassanaLekha ->
                            vipassanaLekha3 = nextVipassanaLekha
                        }
                    )
                }
            }
        }
        composeTestRule.onNodeWithContentDescription(
            label = "ओघतरणसुत्तं",
            substring = true
        ).assertIsDisplayed()
        composeTestRule.onNodeWithText("Meditation: Best Practice (One Reason)").assertIsDisplayed()
        composeTestRule.onNodeWithText("Amar").assertIsDisplayed()
        composeTestRule.onNodeWithText("2026").assertIsDisplayed()
    }

    @Test
    fun render_vipassana_lekha4() {
        composeTestRule.setContent {
            VipassanaLekhaTheme {
                Column{
                    Render(vipassanaLekha4)
                    TouchHandling(
                        vipassanaLekha = vipassanaLekha4,
                        onButtonClick = {
                                nextVipassanaLekha ->
                            vipassanaLekha4 = nextVipassanaLekha
                        }
                    )
                }
            }
        }
        composeTestRule.onNodeWithContentDescription(
            label = "loving-kindness",
            substring = true
        ).assertIsDisplayed()
        composeTestRule.onNodeWithText("When the failure of Loving-kindness").assertIsDisplayed()
        composeTestRule.onNodeWithText("Amar").assertIsDisplayed()
        composeTestRule.onNodeWithText("2026").assertIsDisplayed()
    }

    @Test
    fun render_vipassana_lekha5() {
        composeTestRule.setContent {
            VipassanaLekhaTheme {
                Column{
                    Render(vipassanaLekha5)
                    TouchHandling(
                        vipassanaLekha = vipassanaLekha5,
                        onButtonClick = {
                                nextVipassanaLekha ->
                            vipassanaLekha5 = nextVipassanaLekha
                        }
                    )
                }
            }
        }
        composeTestRule.onNodeWithContentDescription(
            label = "complexities overhead",
            substring = true
        ).assertIsDisplayed()
        composeTestRule.onNodeWithText("Identity view and Interface").assertIsDisplayed()
        composeTestRule.onNodeWithText("Amar").assertIsDisplayed()
        composeTestRule.onNodeWithText("2026").assertIsDisplayed()
    }

    @Test
    fun render_vipassana_lekha6() {
        composeTestRule.setContent {
            VipassanaLekhaTheme {
                Column{
                    Render(vipassanaLekha6)
                    TouchHandling(
                        vipassanaLekha = vipassanaLekha6,
                        onButtonClick = {
                                nextVipassanaLekha ->
                            vipassanaLekha6 = nextVipassanaLekha
                        }
                    )
                }
            }
        }
        composeTestRule.onNodeWithContentDescription(
            label = "ਭਾਵ ਤ੍ਰਿਸ਼ਨਾ ਦੇ ਕਾਰਨ ਹੀ ਨੇਕੀ ਦੀ ਕਮਾਈ ਦੇ ਨਤੀਜੇ ਦੀ ਲਾਲਸ",
            substring = true
        ).assertIsDisplayed()
        composeTestRule.onNodeWithText("Righteousness in the Ocean").assertIsDisplayed()
        composeTestRule.onNodeWithText("Amar").assertIsDisplayed()
        composeTestRule.onNodeWithText("2026").assertIsDisplayed()
    }

    @Test
    fun render_vipassana_lekha7() {
        composeTestRule.setContent {
            VipassanaLekhaTheme {
                Column{
                    Render(vipassanaLekha7)
                    TouchHandling(
                        vipassanaLekha = vipassanaLekha7,
                        onButtonClick = {
                                nextVipassanaLekha ->
                            vipassanaLekha7 = nextVipassanaLekha
                        }
                    )
                }
            }
        }
        composeTestRule.onNodeWithContentDescription(
            label = "ਕੁਝ ਸਮਾਨ ਹੀ ਹਰ ਪ੍ਰਣਾਲੀ ਦੇ ਸੰਦਰਭ ਵਿੱਚ",
            substring = true
        ).assertIsDisplayed()
        composeTestRule.onNodeWithText("Past").assertIsDisplayed()
        composeTestRule.onNodeWithText("Amar").assertIsDisplayed()
        composeTestRule.onNodeWithText("2026").assertIsDisplayed()
    }
    //End of function Render Test

    //Start of function TouchHandling() Tests
    @Test
    fun vipassanaLekha_prev_button_action() {
        composeTestRule.setContent {
            VipassanaLekhaTheme {
                Column {
                    BigBang()
                }
            }
        }
        composeTestRule.onNodeWithText("Previous").performClick()

        composeTestRule.onNodeWithContentDescription(
            label = "ਸਮਥ ਬਿਨਾਂ ਕੋਈ ਵਿਪਾਸਨਾ ਨਹੀਂ|",
            substring = true
        ).assertIsDisplayed()
        composeTestRule.onNodeWithText("Past").assertIsDisplayed()
        composeTestRule.onNodeWithText("Amar").assertIsDisplayed()
        composeTestRule.onNodeWithText("2026").assertIsDisplayed()
    }

    @Test
    fun vipassanaLekha_next_button_action() {
        composeTestRule.setContent {
            VipassanaLekhaTheme {
                BigBang()
            }
        }
        composeTestRule.onNodeWithText("Next").performClick()

        composeTestRule.onNodeWithContentDescription(
            label = "ਜ਼ਿਆਦਾ ਇੱਛਾਵਾਂ ਦੀ ਹਾਲਤ ਵਿੱਚ ਚਿੱਤ ਇੱਕ ਬਾਂਦਰ ਦੀ ਤਰ੍ਹਾਂ",
            substring = true
        ).assertIsDisplayed()
        composeTestRule.onNodeWithText("Monkey Mind").assertIsDisplayed()
        composeTestRule.onNodeWithText("Amar").assertIsDisplayed()
        composeTestRule.onNodeWithText("2026").assertIsDisplayed()
    }
    // End of function TouchHandling() tests

}