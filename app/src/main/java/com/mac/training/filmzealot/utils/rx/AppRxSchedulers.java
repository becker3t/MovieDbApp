package com.mac.training.filmzealot.utils.rx;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Android on 6/28/2017.
 */

public class AppRxSchedulers implements RxSchedulers {

    public static Executor backgroundExecutor = Executors.newCachedThreadPool();
    public static Scheduler BACKGROUND_SCHEDULER = Schedulers.from(backgroundExecutor);
    public static Executor internetExecutor = Executors.newCachedThreadPool();
    public static Scheduler INTERNET_SCHEDULER = Schedulers.from(internetExecutor);

    @Override
    public Scheduler runOnBackground() {
        return BACKGROUND_SCHEDULER;
    }

    @Override
    public Scheduler io() {
        return Schedulers.io();
    }

    @Override
    public Scheduler compute() {
        return Schedulers.computation();
    }

    @Override
    public Scheduler androidThread() {
        return AndroidSchedulers.mainThread();
    }

    @Override
    public Scheduler internet() {
        return INTERNET_SCHEDULER;
    }
}
