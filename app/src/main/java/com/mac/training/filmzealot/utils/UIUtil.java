package com.mac.training.filmzealot.utils;

import android.support.design.widget.Snackbar;
import android.view.View;

import java.util.Timer;

import timber.log.Timber;

/**
 * Created by Android on 6/28/2017.
 */

public class UIUtil {

    public static void handleThrowable(Throwable throwable) {
        Timber.e(throwable, throwable.toString());
    }

    public static void showSnackBar(View view, String mes, int length) {
        Snackbar.make(view, mes, length).setAction("Action", null).show();
    }
}
