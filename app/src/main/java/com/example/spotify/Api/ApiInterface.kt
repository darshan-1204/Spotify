package com.example.spotify.Api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {

    @GET("search")
    @Headers(
        "X-RapidAPI-Key: ef2d51e5e9dd4ac09c760b428a33118b",
        "X-RapidAPI-Host: spotify23.p.rapidapi.com"
    )
    fun search(
        @Query("q") query: String,
        @Query("type") type: String ,
        @Query("offset") offset: Int = 0,
        @Query("limit") limit: Int = 10,
        @Query("numberOfTopResults") numberOfTopResults: Int = 5
    ): Call<SpotifyModel>
}