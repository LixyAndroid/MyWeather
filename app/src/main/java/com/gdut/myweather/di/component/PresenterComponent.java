package com.gdut.myweather.di.component;

import com.gdut.myweather.di.module.ApplicationModule;
import com.gdut.myweather.feature.home.drawer.DrawerMenuPresenter;
import com.gdut.myweather.feature.selectcity.SelectCityPresenter;

import javax.inject.Singleton;

import dagger.Component;
import com.gdut.myweather.feature.home.HomePagePresenter;

/**
 * @author 张磊 (baron[dot]zhanglei[at]gmail[dot]com)
 *         2016/12/2
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface PresenterComponent {

    void inject(HomePagePresenter presenter);

    void inject(SelectCityPresenter presenter);

    void inject(DrawerMenuPresenter presenter);
}
 