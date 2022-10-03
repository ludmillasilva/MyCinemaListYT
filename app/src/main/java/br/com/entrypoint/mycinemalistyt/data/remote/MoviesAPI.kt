package br.com.entrypoint.mycinemalistyt.data.remote

import android.telecom.Call
import br.com.entrypoint.mycinemalistyt.data.remote.response.PopularMovieResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesAPI {

    @GET("/3/movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = API_KEY
    ):retrofit2.Call<PopularMovieResponse>

    companion object {
        val BASE_URL = "https://api.themoviedb.org/"
        val API_KEY = "7f738c6b3ae0addbacb6c93b356b5c6b"
    }
}