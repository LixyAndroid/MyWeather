package com.gdut.myweather.di.component;

import android.content.Context;

import com.gdut.myweather.WeatherApplication;
import com.gdut.myweather.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author 张磊 (baron[dot]zhanglei[at]gmail[dot]com)
 *         2016/11/30
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    WeatherApplication getApplication();

    Context getContext();
}
