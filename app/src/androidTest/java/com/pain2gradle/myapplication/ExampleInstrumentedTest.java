package com.pain2gradle.myapplication;

import android.app.Activity;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.annotation.UiThreadTest;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

/**
 * 编写好该类之后 直接gradlew connectedAndroidTest即可在模拟器上运行
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ExampleInstrumentedTest {
   /* @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.pain2gradle.myapplication", appContext.getPackageName());
    }*/
   //添加需要测试的Activity
    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule=new ActivityTestRule<MainActivity>(MainActivity.class);
    //必须@Test 如果进行UI的操作还要@uiTest
    @UiThreadTest
    @Test
    public void vaildSomething(){
        mainActivityTestRule.getActivity().findViewById(R.id.textview).performClick();

    }

}
