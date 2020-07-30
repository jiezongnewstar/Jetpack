package com.xibei.jetpack.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "LiveData"
    }
    val text: LiveData<String> = _text
}