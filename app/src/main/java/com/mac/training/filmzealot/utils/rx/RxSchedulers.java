package com.mac.training.filmzealot.utils.rx;

import rx.Scheduler;

/**
 * Created by Android on 6/28/2017.
 */

public interface RxSchedulers {

    Scheduler runOnBackground();

    Scheduler io();

    Scheduler compute();

    Scheduler androidThread();

    Scheduler internet();

}