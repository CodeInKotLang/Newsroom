package com.example.newsroom.domain.repository

import com.example.newsroom.domain.model.Article
import com.example.newsroom.util.Resource

interface NewsRepository {

    suspend fun getTopHeadlines(
        category: String
    ): Resource<List<Article>>


    suspend fun searchForNews(
        query: String
    ): Resource<List<Article>>
}