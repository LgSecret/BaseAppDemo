package com.text.lg.myapplication.di.component;

import android.content.Context;


import com.text.lg.myapplication.di.module.ServiceModule;
import com.text.lg.myapplication.di.scope.ContextLife;
import com.text.lg.myapplication.di.scope.PerService;

import dagger.Component;


/**
 * Created by lg on 2017/1/19.
 */
@PerService
@Component(dependencies = ApplicationComponent.class, modules = ServiceModule.class)
public interface ServiceComponent {
    @ContextLife("Service")
    Context getServiceContext();

    @ContextLife("Application")
    Context getApplicationContext();
}
