package com.mac.training.filmzealot.utils;

import android.util.Log;

import com.google.firebase.crash.FirebaseCrash;

import timber.log.Timber;

public class CrashReportingTree extends Timber.Tree{
    @Override
    protected void log(int priority, String tag, String message, Throwable t) {
        if(priority == Log.VERBOSE || priority == Log.DEBUG) {
            return;
        }

        FirebaseCrash.logcat(priority, tag, message);
        FirebaseCrash.report(t);
    }
}
