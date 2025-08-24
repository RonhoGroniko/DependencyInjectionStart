package com.example.dependencyinjectionstart.example2.data.network

import android.util.Log

class ExampleApiService {

    fun method() {
        Log.d(TAG, "ExampleApiService")
    }

    companion object {

        private const val TAG = "EXAMPLE_TEST"
    }
}