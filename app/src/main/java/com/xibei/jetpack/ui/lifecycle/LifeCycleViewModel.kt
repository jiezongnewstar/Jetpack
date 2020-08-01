package com.xibei.jetpack.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LifeCycleViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "LifeCycle"
    }
    val text: MutableLiveData<String> = _text
}