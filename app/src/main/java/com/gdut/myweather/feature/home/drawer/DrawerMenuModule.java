package com.gdut.myweather.feature.home.drawer;

import com.gdut.myweather.di.scope.ActivityScoped;
import com.gdut.myweather.feature.home.drawer.DrawerContract;

import dagger.Module;
import dagger.Provides;

/**
 * @author Mloong
 *         2016/11/30
 */
@Module
public class DrawerMenuModule {

    private DrawerContract.View view;

    public DrawerMenuModule(DrawerContract.View view) {
        this.view = view;
    }

    @Provides
    @ActivityScoped
    DrawerContract.View provideCityManagerContactView() {
        return view;
    }
}
