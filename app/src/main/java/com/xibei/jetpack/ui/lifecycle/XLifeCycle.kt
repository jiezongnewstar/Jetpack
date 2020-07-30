package com.xibei.jetpack.ui.lifecycle

import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 *   Created by Xibei on 2020/7/30.
 *   Github: https://github.com/jiezongnewstar
 *   Email: ibossjia@gmail.com
 *   Deeclaration:
 */
class XLifeCycle(textView: TextView) : LifecycleObserver {

    private val mTextView  = textView

    private val TAG = "XB_LifeCycle"

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private fun create(){
        Log.e(TAG,"create")
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private fun start(){
        Log.e(TAG,"start")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private fun resume(){
        Log.e(TAG,"resume")
        mTextView.postDelayed(Runnable {mTextView.text = "嘿嘿，我变了😋"  },2000)

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private fun stop(){
        Log.e(TAG,"stop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private fun pause(){
        Log.e(TAG,"pause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private fun destory(){
        Log.e(TAG,"destory")
    }

}