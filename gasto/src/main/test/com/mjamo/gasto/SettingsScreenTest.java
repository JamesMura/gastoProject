package com.mjamo.gasto;

import android.annotation.TargetApi;
import android.os.Build;
import android.test.ActivityInstrumentationTestCase2;

import com.jayway.android.robotium.solo.Solo;

public class SettingsScreenTest extends ActivityInstrumentationTestCase2<SettingsActivity> {
    private Solo solo;

    @TargetApi(Build.VERSION_CODES.FROYO)
    public SettingsScreenTest() {
        super(SettingsActivity.class);
    }

    protected void setUp() throws Exception {
        super.setUp();

        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testActivity() {
        // robotium assert
        solo.assertCurrentActivity("Welcome Screen", SettingsActivity.class);
        // junit assert
        assertEquals(true, true);
    }
}
