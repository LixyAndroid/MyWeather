package com.gdut.myweather.feature.home;

import com.gdut.myweather.di.component.ApplicationComponent;
import com.gdut.myweather.di.scope.ActivityScoped;

import dagger.Component;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 *         2016/11/29
 */
@ActivityScoped
@Component(modules = HomePageModule.class, dependencies = ApplicationComponent.class)
public interface HomePageComponent {

    void inject(MainActivity mainActivity);
}
