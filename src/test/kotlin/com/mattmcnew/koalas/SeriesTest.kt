package com.mattmcnew.koalas

import org.jetbrains.spek.api.Spek
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class SeriesTest : Spek({
    describe("equality") {
        it("checks for matching content") {
            assertEquals(Series(listOf(1, 2, 3)), Series(listOf(1, 2, 3)))
            assertEquals(Series(listOf(1, null, 3)), Series(listOf(1, null, 3)))

            assertNotEquals(Series(listOf(1, 3, 2)), Series(listOf(1, 2, 3)))
        }

        it("handles doubles Datatypes") {
            assertEquals(Series(listOf(1, 2.2, 3)), Series(listOf(1, 2.2, 3)))
            assertNotEquals(Series(listOf(1, 2.3, 3)), Series(listOf(1, 2.2, 3)))
        }

        it("handles string Datatypes") {
            assertEquals(Series(listOf("a", "b")), Series(listOf("a", "b")))
            assertNotEquals(Series(listOf("a", "b")), Series(listOf("a", "c")))
        }
    }
})
