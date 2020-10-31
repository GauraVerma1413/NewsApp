package com.androiddevs.mvvmnewsapp.Repository

import com.androiddevs.mvvmnewsapp.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.database.ArticleDatabase

class NewsRepository(
    val db : ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode:String, pageNumber:Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchForNews(searchQuery:String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)
}