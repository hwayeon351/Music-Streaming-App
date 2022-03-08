package com.example.music_streaming_app.sevice

fun MusicEntity.mapper(id: Long): MusicModel =
    MusicModel(
        id = id,
        track = track,
        artist = artist,
        streamUrl = streamUrl,
        coverUrl = coverUrl
    )