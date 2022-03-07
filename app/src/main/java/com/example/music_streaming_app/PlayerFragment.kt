package com.example.music_streaming_app

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.example.music_streaming_app.sevice.MusicDto
import com.example.music_streaming_app.sevice.MusicService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PlayerFragment: Fragment(R.layout.fragment_player) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getVideoListFromServer()
    }

    private fun getVideoListFromServer() {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://run.mocky.io")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(MusicService::class.java)
            .also {
                it.listMusics()
                    .enqueue(object: Callback<MusicDto>{
                        override fun onResponse(
                            call: Call<MusicDto>,
                            response: Response<MusicDto>
                        ) {
                            if (response.isSuccessful.not()) {
                                Log.d("PlayerFragment", "getVideoListFromServer Failed!!!")
                                return
                            }
                            Log.d("PlayerFragment", "${response.body()}")
                        }

                        override fun onFailure(call: Call<MusicDto>, t: Throwable) {
                            t.printStackTrace()
                        }

                    })
            }
    }

    companion object {
        fun newInstance(): PlayerFragment{
            return PlayerFragment()
        }
    }
}