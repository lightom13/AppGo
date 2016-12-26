package com.tom.appgo;

import android.app.Application;

import com.tom.appgo.injection.component.AppComponent;
import com.tom.appgo.injection.component.DaggerAppComponent;
import com.tom.appgo.injection.module.AppModule;

/*
* add by tom at 2016/12/23
*/
public class BaseApplication extends Application {

    private static BaseApplication mApplication;

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplication = this;
        initComponent();
    }

    public static BaseApplication getApplication() {
        return mApplication;
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    private void initComponent() {
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }
}
