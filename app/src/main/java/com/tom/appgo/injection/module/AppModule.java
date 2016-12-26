package com.tom.appgo.injection.module;

import android.app.Application;
import android.content.Context;

import com.tom.appgo.injection.ContextLife;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/*
* add by tom at 16/8/24
*/
@Module
public class AppModule {

    private final Application mApplication;

    public AppModule(Application application) {
        this.mApplication = application;
    }

    @Provides
    @Singleton
    @ContextLife("Application")
    public Context provideContext() {
        return mApplication.getApplicationContext();
    }

}
