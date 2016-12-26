package com.tom.appgo.ui.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tom.appgo.BaseApplication;
import com.tom.appgo.injection.component.ActivityComponent;
import com.tom.appgo.injection.component.DaggerActivityComponent;
import com.tom.appgo.injection.module.ActivityModule;

/**
 * Abstract activity that every other Activity in this application must implement. It handles
 * creation of Dagger components and makes sure that instances of ConfigPersistentComponent survive
 * across configuration changes.
 */
public class BaseActivity extends AppCompatActivity {

    protected ActivityComponent mActivityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .appComponent(((BaseApplication) getApplication()).getAppComponent())
                .build();
    }
}
