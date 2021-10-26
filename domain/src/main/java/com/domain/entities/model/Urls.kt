package com.domain.entities.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
class Urls(
    @field:SerializedName("raw")
    var raw: String? = null,
    @field:SerializedName("full")
    var full: String? = null,
    @field:SerializedName("regular")
    var regular: String? = null,
    @field:SerializedName("small")
    var small: String? = null,
    @field:SerializedName("thumb")
    var thumb: String? = null
) {
}