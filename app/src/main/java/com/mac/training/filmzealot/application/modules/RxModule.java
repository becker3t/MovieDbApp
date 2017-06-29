package com.mac.training.filmzealot.application.modules;

import com.mac.training.filmzealot.utils.rx.AppRxSchedulers;
import com.mac.training.filmzealot.utils.rx.RxSchedulers;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Android on 6/28/2017.
 */

@Module
public class RxModule {

    @Provides
    RxSchedulers provideRxSchedulers() {
        return  new AppRxSchedulers();
    }

}
