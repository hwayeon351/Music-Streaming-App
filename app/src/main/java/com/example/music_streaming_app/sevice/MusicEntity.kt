package com.example.music_streaming_app.sevice

import com.google.gson.annotations.SerializedName

data class MusicEntity(
    @SerializedName("track") val track: String,
    @SerializedName("streamUrl") val streamUrl: String,
    @SerializedName("artist") val artist: String,
    @SerializedName("coverUrl") val coverUrl: String
)