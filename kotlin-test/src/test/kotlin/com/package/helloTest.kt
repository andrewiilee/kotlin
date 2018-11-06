package com.`package`

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Created by alee2 on 2/28/18.
 * @author alee2
 */

class HelloTest {

    @Test
    fun `null test`() {
        println("null test")
        var a = "value"
        var b: String? = "someValue"
        b = null

        //must handle null case
        if (b != null)
            println(b.length)
        else
            println(null)

        Assert.assertEquals(a.length, 5)
        Assert.assertNull(b)

    }

    @Test
    fun testWhenWithoutArgument() {
        val fileType = "ntfs"

        val objectType = when {
            fileType === "ntfs" -> "windows"
            fileType === "ext4" -> "linux"
            fileType === "apfs" -> "apple"
            else -> "unknown file type"
        }
        println("input = ntfs, output = " + objectType)
        assertEquals("windows", objectType)
    }

    @Test
    fun `generic test`() {
        println("generic test")

        val parameterizedClass = ParameterizedClass("string-value")

        val res = parameterizedClass.getValue()

        assertTrue(res is String)

        val parameterized = ParameterizedClass(1)
        assertTrue(parameterized.getValue() is Int)
    }


}

class ParameterizedClass<A>(private val value: A) {

    fun getValue(): A {
        return value
    }
}
