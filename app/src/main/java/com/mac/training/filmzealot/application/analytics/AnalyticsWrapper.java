package com.mac.training.filmzealot.application.analytics;

import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;

/**
 * Created by Android on 6/28/2017.
 */

public class AnalyticsWrapper implements Analytics {

    private FirebaseAnalytics analytics;

    public AnalyticsWrapper(FirebaseAnalytics analytics) {
        this.analytics = analytics;
    }

    @Override
    public void logContentEvent(String id, String name, String contentType) {
        analytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, getBundle(id, name, contentType));
    }

    private Bundle getBundle(String id, String name, String contentType) {
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, id);
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, name);
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, contentType);
        return bundle;
    }
}
