package com.tom.appgo.injection.module;

/*
* add by tom at 16/8/24
*/

import android.app.Activity;
import android.content.Context;

import com.tom.appgo.injection.ContextLife;
import com.tom.appgo.injection.PerActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @PerActivity
    @ContextLife("Activity")
    public Context provideContext() {
        return mActivity;
    }

    @Provides
    @PerActivity
    public Activity provideActivity() {
        return mActivity;
    }
}
