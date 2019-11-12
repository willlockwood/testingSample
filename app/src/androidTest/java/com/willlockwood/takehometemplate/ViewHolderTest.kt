package com.willlockwood.takehometemplate

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.willlockwood.takehometemplate.activity.MainActivity
import org.hamcrest.CoreMatchers.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ViewHolderTest {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule<MainActivity>(MainActivity::class.java)

    @Test
    fun findRecyclerView() {
        onView(allOf(withId(R.id.recycler_view), isCompletelyDisplayed()))
            .check(matches(isCompletelyDisplayed()))
    }

//    private fun isInTheMiddle(): Matcher<LockwoodRecyclerAdapter.LockwoodViewHolder> {
//        return object: TypeSafeMatcher<LockwoodRecyclerAdapter.LockwoodViewHolder>() {
//            override fun describeTo(description: Description?) {
//                description?.appendText("item in the middle")
//            }
//
//            override fun matchesSafely(item: LockwoodRecyclerAdapter.LockwoodViewHolder?): Boolean {
////                return item.username
////                add a function in teh actual class in main
//            }
//
//        }
//    }

//    @Test
//    fun useAppContext() {
//        // Context of the app under test.
//        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
//        Assert.assertEquals("com.willlockwood.takehometemplate", appContext.packageName)
//    }

}