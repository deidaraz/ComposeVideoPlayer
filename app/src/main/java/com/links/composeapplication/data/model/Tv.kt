package com.links.composeapplication.data.model

data class Tv(
    val id: Long = 0,
    val backdrop_path: String,
    val poster_path: String,
    val first_air_date: String,
    val overview: String,
    val name: String,
    val original_name: String,
)