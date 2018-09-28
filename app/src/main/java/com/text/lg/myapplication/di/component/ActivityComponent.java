package com.text.lg.myapplication.di.component;

import android.app.Activity;
import android.content.Context;


import com.text.lg.myapplication.di.module.ActivityModule;
import com.text.lg.myapplication.di.scope.ContextLife;
import com.text.lg.myapplication.di.scope.PerActivity;

import dagger.Component;

/**
 * Created by lg on 2017/1/19.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    @ContextLife("Activity")
    Context getActivityContext();

    @ContextLife("Application")
    Context getApplicationContext();

    Activity getActivity();

    //绑定新创建的activity
   // void inject(SearchActivity activity);
}
