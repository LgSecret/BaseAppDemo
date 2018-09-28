package com.text.lg.myapplication.di.module;

import android.content.Context;


import com.text.lg.myapplication.app.App;
import com.text.lg.myapplication.di.scope.ContextLife;
import com.text.lg.myapplication.di.scope.PerApp;

import dagger.Module;
import dagger.Provides;


/**
 * Created by lg on 2017/1/19.
 */
@Module
public class ApplicationModule {
    private App mApplication;

    public ApplicationModule(App application) {
        mApplication = application;
    }

    @Provides
    @PerApp
    @ContextLife("Application")
    public Context provideApplicationContext() {
        return mApplication.getApplicationContext();
    }
}
