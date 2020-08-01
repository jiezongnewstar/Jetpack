package com.xibei.jetpack.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "ViewModel"
    }
    val text: MutableLiveData<String> = _text
}