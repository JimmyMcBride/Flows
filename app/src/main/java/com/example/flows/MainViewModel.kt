package com.example.flows

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.last
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val _countState = MutableStateFlow(0)
    val countState get() = _countState.asStateFlow()

    fun start() {
        Log.d(TAG, "initializing starting flow")
        viewModelScope.launch {
            startCount()
            endCount()
        }

    }

    private suspend fun startCount() {
        (1..10).forEach { num ->
            _countState.value = num
            delay(1000L)
        }
    }

    private fun endCount() {
        _countState.value = 11
    }


    companion object {
        const val TAG = "Logger"
    }
}
