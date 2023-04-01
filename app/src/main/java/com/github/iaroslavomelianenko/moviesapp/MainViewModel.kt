package com.github.iaroslavomelianenko.moviesapp

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.iaroslavomelianenko.moviesapp.data.models.Movies
import com.github.iaroslavomelianenko.moviesapp.data.network.ApiRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: ApiRepository): ViewModel() {

    //LiveData with full list of movies
    private val _allMovies = MutableLiveData<List<Movies>>()
    val allMovies: LiveData<List<Movies>>
    get() = _allMovies

    //Scope requests getAllMovies() from our repository. If its successful, liveData receives values of all movies
    fun getAllMovies() {
        viewModelScope.launch {
            repository.getAllMovies().let {
                if (it.isSuccessful) {
                    _allMovies.postValue(it.body())
                } else {
                    Log.d("checkData", "Failed to load movies: ${it.errorBody()}")
                }
            }
        }
    }
}