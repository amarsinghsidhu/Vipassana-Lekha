package com.example.vipassanalekha

import junit.framework.TestCase.assertEquals
import org.junit.Test

class VipassanaLekhaTests {

    @Test
    fun touchHandling_vipassanaLekha0Previous() {
        val vipassanaLekha = vipassanaLekha0
        val keyEvent = "previous"
        val nextState = vipassanaLekha7
        val actualState = touchHandling(vipassanaLekha, keyEvent)
        assertEquals(nextState, actualState)
    }

    @Test
    fun touchHandling_vipassanaLekha0Next() {
        val vipassanaLekha = vipassanaLekha0
        val keyEvent = "next"
        val nextState = vipassanaLekha1
        val actualState = touchHandling(vipassanaLekha, keyEvent)
        assertEquals(nextState, actualState)
    }
}