package com.mac.training.filmzealot.application.components;

import android.content.Context;

import com.mac.training.filmzealot.application.analytics.Analytics;
import com.mac.training.filmzealot.application.modules.AnalyticsModule;
import com.mac.training.filmzealot.application.modules.AppContextModule;
import com.mac.training.filmzealot.application.modules.MovieApiModule;
import com.mac.training.filmzealot.application.modules.NetworkModule;
import com.mac.training.filmzealot.application.modules.RxModule;
import com.mac.training.filmzealot.application.scopes.AppScope;
import com.mac.training.filmzealot.utils.rx.RxSchedulers;

import dagger.Component;

@AppScope
@Component(modules = {
        AppContextModule.class,
        AnalyticsModule.class,
        NetworkModule.class,
        RxModule.class,
        MovieApiModule.class
})
public interface AppComponent {

    Context getAppContext();

    RxSchedulers rxSchedulers();

    Analytics analytics();

}
