package com.domain.entities.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
class ProfileImage(
    @field:SerializedName("small")
    var small: String? = null,
    @field:SerializedName("medium")
    var medium: String? = null,
    @field:SerializedName("large")
    var large: String? = null
) {
}