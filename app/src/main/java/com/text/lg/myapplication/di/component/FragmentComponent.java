package com.text.lg.myapplication.di.component;

import android.app.Activity;
import android.content.Context;


import com.text.lg.myapplication.di.module.FragmentModule;
import com.text.lg.myapplication.di.scope.ContextLife;
import com.text.lg.myapplication.di.scope.PerFragment;

import dagger.Component;

/**
 * Created by lg on 2017/1/19.
 */
@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {
    @ContextLife("Activity")
    Context getActivityContext();

    @ContextLife("Application")
    Context getApplicationContext();

    Activity getActivity();

    //绑定新创建的fragment
   // void inject(HomeFragment fragment);

}
