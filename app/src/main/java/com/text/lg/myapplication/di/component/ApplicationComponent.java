package com.text.lg.myapplication.di.component;

import android.content.Context;

import com.text.lg.myapplication.di.module.ApplicationModule;
import com.text.lg.myapplication.di.scope.ContextLife;
import com.text.lg.myapplication.di.scope.PerApp;

import dagger.Component;


/**
 * Created by lg on 2017/1/19.
 */
@PerApp
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    @ContextLife("Application")
    Context getApplication();
}