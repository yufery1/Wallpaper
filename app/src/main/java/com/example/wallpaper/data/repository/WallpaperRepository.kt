package com.example.wallpaper.data.repository

import com.example.wallpaper.domain.model.Wallpaper
import com.example.wallpaper.domain.repository.RetrofitClient

class WallpaperRepository {
    suspend fun getWallpapers():List<Wallpaper>{
        return RetrofitClient.apiService.getWallpapers()
    }
}