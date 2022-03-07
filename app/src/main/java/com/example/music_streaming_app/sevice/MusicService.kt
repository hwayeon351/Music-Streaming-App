package com.example.music_streaming_app.sevice

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {
    @GET("/v3/0554c45f-8e9f-454e-837f-7e5da0663515")
    fun listMusics(): Call<MusicDto>
}