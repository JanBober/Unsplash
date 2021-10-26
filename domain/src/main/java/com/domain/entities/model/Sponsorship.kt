package com.domain.entities.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
class Sponsorship(
    @field:SerializedName("impression_urls")
    var impression_urls: List<String>? = null,
    @field:SerializedName("tagline")
    var tagline: String? = null,
    @field:SerializedName("tagline_url")
    var tagline_url: String? = null,
    @field:SerializedName("sponsor")
    var sponsor: Sponsor? = null
) {
}