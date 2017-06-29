package com.mac.training.filmzealot.application.modules;

import android.content.Context;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.mac.training.filmzealot.application.analytics.Analytics;
import com.mac.training.filmzealot.application.analytics.AnalyticsWrapper;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Android on 6/28/2017.
 */

@Module
public class AnalyticsModule {

    private Context context;

    public AnalyticsModule(Context context) {
        this.context = context;
    }

    @Provides
    Analytics providesFirebaseAnalytics() {
        return new AnalyticsWrapper(FirebaseAnalytics.getInstance(context));
    }
}
