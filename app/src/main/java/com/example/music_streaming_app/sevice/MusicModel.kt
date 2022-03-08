package com.example.music_streaming_app.sevice

data class MusicModel(
    val id: Long,
    val track: String,
    val artist: String,
    val streamUrl: String,
    val coverUrl: String,
    val isPlaying: Boolean = false
)