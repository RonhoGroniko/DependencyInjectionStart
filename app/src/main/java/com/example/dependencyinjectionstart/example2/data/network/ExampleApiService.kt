package com.example.dependencyinjectionstart.example2.data.network

import android.util.Log
import javax.inject.Inject

class ExampleApiService @Inject constructor() {

    fun method() {
        Log.d(TAG, "ExampleApiService")
    }

    companion object {

        private const val TAG = "EXAMPLE_TEST"
    }
}