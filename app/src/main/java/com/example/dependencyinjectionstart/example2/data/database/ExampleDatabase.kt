package com.example.dependencyinjectionstart.example2.data.database

import android.content.Context
import android.util.Log
import com.example.dependencyinjectionstart.R
import javax.inject.Inject

class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val millis: Long
) {

    fun method() {
        Log.d(TAG, "ExampleDatabase " + context.getString(R.string.app_name) + " $millis")
    }

    companion object {

        private const val TAG = "EXAMPLE_TEST"
    }
}