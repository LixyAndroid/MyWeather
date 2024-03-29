package com.gdut.myweather.feature.selectcity;

import dagger.Module;
import dagger.Provides;

import com.gdut.myweather.di.scope.ActivityScoped;

/**
 * @author Mloong
 *         2016/11/30
 */
@Module
public class SelectCityModule {

    private SelectCityContract.View view;

    public SelectCityModule(SelectCityContract.View view) {
        this.view = view;
    }

    @Provides
    @ActivityScoped
    SelectCityContract.View provideSelectCityContractView() {
        return view;
    }
}
