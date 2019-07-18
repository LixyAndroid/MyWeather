package com.gdut.myweather.di.module;

import android.content.Context;

import com.gdut.myweather.WeatherApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 *
 *         2016/11/30
 */
@Module
public class ApplicationModule {

    private Context context;

    public ApplicationModule(Context context) {

        this.context = context;
    }

    @Provides
    @Singleton
    WeatherApplication provideApplication() {

        return (WeatherApplication) context.getApplicationContext();
    }

    @Provides
    @Singleton
    Context provideContext() {

        return context;
    }
}
