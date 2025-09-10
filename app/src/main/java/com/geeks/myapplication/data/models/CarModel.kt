package com.geeks.myapplication.data.models


import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class CarModel(
    val img: String,
    val title: String,
    val price: String,
    val type: String,
    val transmission: String,
    val ac: String
): Parcelable