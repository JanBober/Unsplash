package com.domain.entities.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
class Nature(
    @field:SerializedName("status")
    var status: String? = null
) {
}