<<<<<<< HEAD:AndroidStudioProjects/ch2/app/src/androidTest/java/com/example/myapplication/ExampleInstrumentedTest.kt
package com.example.myapplication
=======
package com.example.ch7
>>>>>>> 04b16c4 (ch7 my web browser):AndroidStudioProjects/ch7/app/src/androidTest/java/com/example/ch7/ExampleInstrumentedTest.kt

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
<<<<<<< HEAD:AndroidStudioProjects/ch2/app/src/androidTest/java/com/example/myapplication/ExampleInstrumentedTest.kt
        assertEquals("com.example.myapplication", appContext.packageName)
=======
        assertEquals("com.example.ch7", appContext.packageName)
>>>>>>> 04b16c4 (ch7 my web browser):AndroidStudioProjects/ch7/app/src/androidTest/java/com/example/ch7/ExampleInstrumentedTest.kt
    }
}