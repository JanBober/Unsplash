package com.domain.entities.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
class TexturesPatterns(
    @field:SerializedName("status")
    var status: String? = null,
    @field:SerializedName("approved_on")
    var approved_on: String? = null
) {
}