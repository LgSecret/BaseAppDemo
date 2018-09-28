package com.text.lg.myapplication.di.module;

import android.app.Service;
import android.content.Context;


import com.text.lg.myapplication.di.scope.ContextLife;
import com.text.lg.myapplication.di.scope.PerService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lg on 2017/1/19.
 */
@Module
public class ServiceModule {
    private Service mService;

    public ServiceModule(Service service) {
        mService = service;
    }

    @Provides
    @PerService
    @ContextLife("Service")
    public Context ProvideServiceContext() {
        return mService;
    }
}
