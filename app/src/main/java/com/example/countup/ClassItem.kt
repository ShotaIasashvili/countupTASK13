package com.example.countup


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ClassItem(
    @Json(name = "created_at")
    val createdAt: Any,
    @Json(name = "date")
    val date: String,
    @Json(name = "deleted_at")
    val deletedAt: Any,
    @Json(name = "description")
    val description: String,
    @Json(name = "id")
    val id: Int,
    @Json(name = "images")
    val images: String,
    @Json(name = "img-url")
    val imgUrl: String,
    @Json(name = "title")
    val title: String,
    @Json(name = "updated_at")
    val updatedAt: Any
)