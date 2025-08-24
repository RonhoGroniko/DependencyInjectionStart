package com.example.dependencyinjectionstart.example2.data.database

import android.util.Log
import javax.inject.Inject

class ExampleDatabase @Inject constructor() {

    fun method() {
        Log.d(TAG, "ExampleDatabase")
    }

    companion object {

        private const val TAG = "EXAMPLE_TEST"
    }
}