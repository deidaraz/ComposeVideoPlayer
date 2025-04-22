package com.links.composeapplication.data.model

data class Movie(
    val id: Long = 0,
    val backdrop_path: String,
    val poster_path: String,
    val release_date: String,
    val overview: String,
    val title: String,
    val original_title: String,
    val video: Boolean
)