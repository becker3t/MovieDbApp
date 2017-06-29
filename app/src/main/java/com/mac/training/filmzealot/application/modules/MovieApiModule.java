package com.mac.training.filmzealot.application.modules;

import com.mac.training.filmzealot.api.MovieApi;
import com.mac.training.filmzealot.application.scopes.AppScope;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


@Module
public class MovieApiModule {

    private static final String BASE_URL = "https://api.themoviedb.org/3/";

    @AppScope
    @Provides
    MovieApi provideMovieApiService(OkHttpClient client, GsonConverterFactory gsonFactory, RxJavaCallAdapterFactory rxFactory) {
        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .addConverterFactory(gsonFactory)
                .addCallAdapterFactory(rxFactory)
                .build();
        return retrofit.create(MovieApi.class);
    }

}
