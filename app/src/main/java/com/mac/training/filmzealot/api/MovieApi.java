package com.mac.training.filmzealot.api;

import android.database.Observable;

import com.mac.training.filmzealot.model.Movies;

import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MovieApi {

    @GET("/movies/upcoming")
    Observable<Movies> getUpcomingMovies(@Path("api_key") String apiKey);

}