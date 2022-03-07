package com.example.music_streaming_app

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class PlayerFragment: Fragment(R.layout.fragment_player) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        fun newInstance(): PlayerFragment{
            return PlayerFragment()
        }
    }
}