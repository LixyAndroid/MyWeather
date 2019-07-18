package com.gdut.myweather.feature.selectcity;

import java.util.List;

import com.gdut.myweather.data.db.entities.City;
import com.gdut.myweather.base.BasePresenter;
import com.gdut.myweather.base.BaseView;

/**
 * @author Mloong
 */
public interface SelectCityContract {

    interface View extends BaseView<Presenter> {

        void displayCities(List<City> cities);
    }

    interface Presenter extends BasePresenter {

        void loadCities();
    }
}
