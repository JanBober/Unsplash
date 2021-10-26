package com.domain.entities.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
class Links(
@field:SerializedName("self")
var self: String? = null,
@field:SerializedName("html")
var html: String? = null,
@field:SerializedName("download")
var download: String? = null,
@field:SerializedName("download_location")
var download_location: String? = null,
@field:SerializedName("photos")
var photos: String? = null,
@field:SerializedName("likes")
var likes: String? = null,
@field:SerializedName("portfolio")
var portfolio: String? = null,
@field:SerializedName("following")
var following: String? = null,
@field:SerializedName("followers")
var followers: String? = null
) {
}