package com.androiddevs.mvvmnewsapp

data class ResponseObject(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)