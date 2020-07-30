package com.xibei.jetpack.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RoomViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Room"
    }
    val text: LiveData<String> = _text
}