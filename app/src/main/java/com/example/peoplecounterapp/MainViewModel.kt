package com.example.peoplecounterapp

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var count = 0

    fun increment() {
        count++
    }

}