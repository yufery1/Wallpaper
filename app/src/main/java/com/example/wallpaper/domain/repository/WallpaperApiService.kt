package com.example.wallpaper.domain.repository

import com.example.wallpaper.domain.model.Wallpaper
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface WallpaperApiService {
    @GET("wallpapers")
    suspend fun getWallpapers():List<Wallpaper>
}
object RetrofitClient{
    val apiService:WallpaperApiService by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(WallpaperApiService::class.java)
    }
}