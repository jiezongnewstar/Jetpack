package com.xibei.jetpack.ui.gallery

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel : ViewModel() {

    private val _text = MutableLiveData<Int>().apply {
        value = 1
    }
    var text: MutableLiveData<Int> = _text
}