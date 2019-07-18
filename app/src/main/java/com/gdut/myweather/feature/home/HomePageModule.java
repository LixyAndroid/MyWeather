package com.gdut.myweather.feature.home;

import com.gdut.myweather.di.scope.ActivityScoped;
import com.gdut.myweather.feature.home.HomePagePresenter;

import dagger.Module;
import dagger.Provides;

import com.gdut.myweather.feature.home.HomePageContract;

/**
 * This is a Dagger module. We use this to pass in the View dependency to the
 * {@link HomePagePresenter}
 *
 * @author Mloong
 *         2016/11/30
 */
@Module
public class HomePageModule {

    private HomePageContract.View view;

    public HomePageModule(HomePageContract.View view) {

        this.view = view;
    }

    @Provides
    @ActivityScoped
    HomePageContract.View provideHomePageContractView() {
        return view;
    }

}
