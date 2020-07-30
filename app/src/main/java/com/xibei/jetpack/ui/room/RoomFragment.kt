package com.xibei.jetpack.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.xibei.jetpack.R

class RoomFragment : Fragment() {

    private lateinit var roomViewModel: RoomViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        roomViewModel =
                ViewModelProviders.of(this).get(RoomViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_room, container, false)
        val textView: TextView = root.findViewById(R.id.text_room)
        roomViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
