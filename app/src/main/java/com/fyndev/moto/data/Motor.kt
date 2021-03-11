package com.fyndev.moto.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Motor(
    val name: String,
    val price: String,
    val overview: String,
    val poster: String
) : Parcelable
