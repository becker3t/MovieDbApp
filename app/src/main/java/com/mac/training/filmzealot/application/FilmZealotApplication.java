package com.mac.training.filmzealot.application;

import android.app.Application;
import android.support.compat.BuildConfig;

import com.facebook.stetho.Stetho;
import com.mac.training.filmzealot.application.components.AppComponent;
import com.mac.training.filmzealot.application.components.DaggerAppComponent;
import com.mac.training.filmzealot.application.modules.AnalyticsModule;
import com.mac.training.filmzealot.application.modules.AppContextModule;
import com.mac.training.filmzealot.application.modules.RxModule;
import com.mac.training.filmzealot.utils.CrashReportingTree;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

import timber.log.Timber;

public class FilmZealotApplication extends Application {

    private RefWatcher refWatcher;
    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initLogger();
        initStetho();
        initAppComponent();
        LeakCanary.install(this);
    }

    private void initAppComponent() {
        appComponent = DaggerAppComponent.builder()
                .appContextModule(new AppContextModule(this))
                .analyticsModule(new AnalyticsModule(this))
                .rxModule(new RxModule())
                .build();
    }

    private void initStetho() {
        if(BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this);
        }
    }

    private void initLogger() {
        if(BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
        else {
            Timber.plant(new CrashReportingTree());
        }
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }

}
