package com.tom.appgo.injection.component;

import android.app.Activity;
import android.content.Context;

import com.tom.appgo.injection.ContextLife;
import com.tom.appgo.injection.PerActivity;
import com.tom.appgo.injection.module.ActivityModule;
import com.tom.appgo.module.main.MainActivity;

import dagger.Component;

/*
* add by tom at 16/8/24
*/
@PerActivity
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

    @ContextLife("Activity")
    Context getActivityContext();

    @ContextLife("Application")
    Context getApplicationContext();

    Activity getActivity();
}
