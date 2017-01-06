package com.tom.appgo.injection.component;

/*
* add by tom at 16/8/24
*/

import android.content.Context;

import com.tom.appgo.data.DataManager;
import com.tom.appgo.injection.ContextLife;
import com.tom.appgo.injection.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    @ContextLife("Application")
    Context getContext();

    DataManager dataManager();
}
