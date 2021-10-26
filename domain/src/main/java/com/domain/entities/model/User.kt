package com.domain.entities.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
class User(
    @field:SerializedName("id")
    var id: String? = null,
    @field:SerializedName("updated_at")
    var updated_at: String? = null,
    @field:SerializedName("username")
    var username: String? = null,
    @field:SerializedName("name")
    var name: String? = null,
    @field:SerializedName("first_name")
    var first_name: String? = null,
    @field:SerializedName("last_name")
    var last_name: String? = null,
    @field:SerializedName("twitter_username")
    var twitter_username: String? = null,
    @field:SerializedName("portfolio_url")
    var portfolio_url: String? = null,
    @field:SerializedName("bio")
    var bio: String? = null,
    @field:SerializedName("location")
    var location: String? = null,
    @field:SerializedName("links")
    var links: Links? = null,
    @field:SerializedName("profile_image")
    var profile_image: ProfileImage? = null,
    @field:SerializedName("instagram_username")
    var instagram_username: String? = null,
    @field:SerializedName("total_collections")
    var total_collections: Int? = null,
    @field:SerializedName("total_likes")
    var total_likes: Int? = null,
    @field:SerializedName("total_photos")
    var total_photos: Int? = null,
    @field:SerializedName("accepted_tos")
    var accepted_tos: Boolean? = null,
    @field:SerializedName("for_hire")
    var for_hire: Boolean? = null,
    @field:SerializedName("social")
    var social: Social? = null
) {
}