package com.mac.training.filmzealot.application.modules;

import android.content.Context;

import com.mac.training.filmzealot.application.scopes.AppScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Android on 6/28/2017.
 */

@Module
public class AppContextModule {

    private Context context;

    public AppContextModule(Context context) {
        this.context = context;
    }

    @AppScope
    @Provides
    Context provideAppContext() {
        return context;
    }
}
