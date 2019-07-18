package com.gdut.myweather.feature.home.drawer;

import com.gdut.myweather.base.BasePresenter;
import com.gdut.myweather.base.BaseView;
import com.gdut.myweather.data.db.entities.minimalist.Weather;

import java.io.InvalidClassException;
import java.util.List;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 *         16/4/16
 */
public interface DrawerContract {

    interface View extends BaseView<DrawerMenuPresenter> {

        void displaySavedCities(List<Weather> weatherList);
    }

    interface Presenter extends BasePresenter {

        void loadSavedCities();

        void deleteCity(String cityId);

        void saveCurrentCityToPreference(String cityId) throws InvalidClassException;
    }
}
