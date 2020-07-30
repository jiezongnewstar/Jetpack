package com.xibei.jetpack.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataBindingViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "DataBinding"
    }
    val text: LiveData<String> = _text
}