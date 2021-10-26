package com.domain.entities.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
class Root(
    @field:SerializedName("id")
    var id: String? = null,
    @field:SerializedName("created_at")
    var created_at: String? = null,
    @field:SerializedName("updated_at")
    var updated_at: String? = null,
    @field:SerializedName("promoted_at")
    var promoted_at: String? = null,
    @field:SerializedName("width")
    var width: Int? = null,
    @field:SerializedName("height")
    var height: Int? = null,
    @field:SerializedName("color")
    var color: String? = null,
    @field:SerializedName("blur_hash")
    var blur_hash: String? = null,
    @field:SerializedName("description")
    var description: String? = null,
    @field:SerializedName("alt_description")
    var alt_description: String? = null,
    @field:SerializedName("urls")
    var urls: Urls? = null,
    @field:SerializedName("links")
    var links: Links? = null,
    @field:SerializedName("categories")
    var categories: List<String>? = null,
    @field:SerializedName("likes")
    var likes: Int? = null,
    @field:SerializedName("liked_by_user")
    var liked_by_user: Boolean? = null,
    @field:SerializedName("current_user_collections")
    var current_user_collections: List<String>? = null,
    @field:SerializedName("sponsorship")
    var sponsorship: Sponsorship? = null,
    @field:SerializedName("topic_submissions")
    var topic_submissions: TopicSubmissions? = null,
    @field:SerializedName("user")
    var user: User? = null
) {
}