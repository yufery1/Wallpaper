package com.example.wallpaper.presentation.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wallpaper.data.repository.WallpaperRepository
import com.example.wallpaper.domain.model.Wallpaper
import kotlinx.coroutines.launch

class WallpapersViewModel:ViewModel() {
    private val wallpapersRepository = WallpaperRepository()

    private val _wallpapers = MutableLiveData<List<Wallpaper>>()
    val wallpapers :LiveData<List<Wallpaper>>  =  _wallpapers

    init {
        viewModelScope.launch {
            _wallpapers.value = wallpapersRepository.getWallpapers()
        }
    }
}