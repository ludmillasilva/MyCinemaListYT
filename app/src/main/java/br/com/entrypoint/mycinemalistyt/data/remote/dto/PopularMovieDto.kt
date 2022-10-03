package br.com.entrypoint.mycinemalistyt.data.remote.dto

import br.com.entrypoint.mycinemalistyt.domain.PopularMovies
import com.google.gson.annotations.SerializedName

data class PopularMovieDto(
    val id: Long,
    val title: String,
    val overview: String,
    @SerializedName("release_date")
    val releaseDate: String,
    @SerializedName("vote_Average")
    val voteAverage: Double
){
    fun toPopularMovies(): PopularMovies {
        return PopularMovies(
          id = id,
          title = title,
          description = overview,
          voteAverage = voteAverage
        )
    }
}
