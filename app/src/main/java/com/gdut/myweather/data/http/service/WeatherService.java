package com.gdut.myweather.data.http.service;

import com.gdut.myweather.data.http.entity.know.KnowWeather;
import com.gdut.myweather.data.http.entity.mi.MiWeather;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @author Mloong
 *         16/2/25
 */
public interface WeatherService {

    /**
     * http://weatherapi.market.xiaomi.com/wtr-v2/weather?cityId=101010100
     *
     * @param cityId 城市ID
     * @return 天气数据
     */
    @GET("weather")
    Observable<MiWeather> getMiWeather(@Query("cityId") String cityId);


    /**
     * http://knowweather.duapp.com/v1.0/weather/101010100
     *
     * @param cityId 城市ID
     * @return 天气数据
     */
    @GET("v1.0/weather/{cityId}")
    Observable<KnowWeather> getKnowWeather(@Path("cityId") String cityId);


}
