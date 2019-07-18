package com.gdut.myweather.feature.home;

import com.gdut.myweather.data.db.entities.minimalist.Weather;
import com.gdut.myweather.base.BasePresenter;
import com.gdut.myweather.base.BaseView;

/**
 * @author Mloong
 */
public interface HomePageContract {

    interface View extends BaseView<Presenter> {

        void displayWeatherInformation(Weather weather);
    }

    interface Presenter extends BasePresenter {

        void loadWeather(String cityId, boolean refreshNow);
    }
}
