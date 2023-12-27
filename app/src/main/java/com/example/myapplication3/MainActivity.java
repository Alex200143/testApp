package com.example.myapplication3;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.exoplayer2.ExoPlaybackException;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("Bazel", "Hello, Android");

        setContentView(R.layout.activity_main);

        int test_number = ExoPlaybackException.TYPE_REMOTE;
        Log.v("Bazel", "test_number: " + test_number);
    }
}
