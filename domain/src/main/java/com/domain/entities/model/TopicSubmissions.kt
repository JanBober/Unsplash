package com.domain.entities.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
class TopicSubmissions(
    @field:SerializedName("businessWork")
    var businessWork: BusinessWork? = null,
    @field:SerializedName("artsCulture")
    var artsCulture: ArtsCulture? = null,
    @field:SerializedName("nature")
    var nature: Nature? = null,
    @field:SerializedName("autumnAesthetic")
    var autumnAesthetic: AutumnAesthetic? = null,
    @field:SerializedName("technology")
    var technology: Technology? = null,
    @field:SerializedName("_3dRenders")
    var _3dRenders: _3dRenders? = null,
    @field:SerializedName("texturesPatterns")
    var texturesPatterns: TexturesPatterns? = null
) {
}