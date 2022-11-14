package com.example.flows

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    fun start() {
        Log.d(TAG, "initializing starting flow")
    }


    companion object {
        const val TAG = "Logger"
    }
}