package com.xibei.jetpack.ui.gallery

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.xibei.jetpack.R
import com.xibei.jetpack.ui.lifecycle.XLifeCycle

class LifeCycleFragment : Fragment() {
    private val TAG = "XB_lifecycleFragment"

    private lateinit var lifeCycleViewModel: LifeCycleViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e(TAG,"onAttach")

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(TAG,"onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        lifeCycleViewModel =
                ViewModelProviders.of(this).get(LifeCycleViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_lifecycle, container, false)
        val textView: TextView = root.findViewById(R.id.text_lifecycle)
        lifecycle.addObserver(XLifeCycle(textView))
        lifeCycleViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG,"onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG,"onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG,"onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG,"onDestroy")
    }
}
