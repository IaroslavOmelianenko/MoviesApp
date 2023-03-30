package com.github.iaroslavomelianenko.moviesapp.data.network

import com.github.iaroslavomelianenko.moviesapp.data.models.Movies
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/shows")
    suspend fun getAllMovies() : Response<List<Movies>>
}