package com.domain.entities.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
class Social(
    @field:SerializedName("instagram_username")
    var instagram_username: String? = null,
    @field:SerializedName("portfolio_url")
    var portfolio_url: String? = null,
    @field:SerializedName("twitter_username")
    var twitter_username: String? = null,
    @field:SerializedName("paypal_email")
    var paypal_email: String? = null
) {
}