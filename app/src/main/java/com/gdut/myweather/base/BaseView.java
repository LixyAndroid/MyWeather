package com.gdut.myweather.base;

/**
 * view interface,所有View(此项目中的View主要是Fragment和自定义的ViewGroup)必须实现此接口
 *
 * @author Mloong
 */
public interface BaseView<T> {

    void setPresenter(T presenter);
}
