package com.willlockwood.takehometemplate

import android.content.Context
import com.willlockwood.takehometemplate.data.model.Lockwood
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ExampleUnitTest {

    @Mock
    private lateinit var mockContext: Context

    @Test
    fun lockwoodDiffCallback_ContentsTheSame_ReturnsTrue() {
        val callback = LockwoodDiffCallback(listOf(Lockwood("will")), listOf(Lockwood("will")))
        assertEquals(callback.areContentsTheSame(0, 0), true)
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}
