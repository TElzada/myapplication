package com.geeks.myapplication.data.models

import java.io.Serializable

data class CarModel(
    val img: String,
    val title: String,
    val price: String,
    val type: String,
    val transmission: String,
    val ac: String
): Serializable