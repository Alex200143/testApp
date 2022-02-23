package com.example.myapplication3

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
//import com.example.attr.Camera
import com.snapchat.android.crema.CremaDeviceSelector
import com.snapchat.android.crema.CremaTest
import com.snapchat.android.crema.CremaTestSuite
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import com.example.myapplication3.R
import androidx.test.espresso.Espresso

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText

import androidx.test.rule.ActivityTestRule
import androidx.test.uiautomator.By.text

import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
//@CremaTestSuite(categories = [Camera::class])
class ExampleInstrumentedTest {
    @get:Rule
    var rule = ActivityTestRule(MainActivity::class.java)
    @Test
//    @CremaTest
//    @CremaDeviceSelector(name = "name1", model ="937", osVersionConstraint = [10])
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.myapplication3", appContext.packageName)
    }

    @Test
    fun shouldUpdateTextAfterButtonClick() {
        onView(withId(R.id.text_hello)).check(matches(withText("Hello World!")))
    }
}