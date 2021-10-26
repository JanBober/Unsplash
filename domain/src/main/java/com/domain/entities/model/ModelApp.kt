package com.domain.entities.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
class ModelApp(
    @field:SerializedName("picture1")
    var picture1: String? = null,
    @field:SerializedName("picture2")
    var picture2: String? = null,
    @field:SerializedName("picture3")
    var picture3: String? = null,
    @field:SerializedName("picture4")
    var picture4: String? = null
) {
}