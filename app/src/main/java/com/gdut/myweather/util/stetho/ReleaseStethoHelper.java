package com.gdut.myweather.util.stetho;

import android.content.Context;

import com.gdut.myweather.util.StethoHelper;

import okhttp3.OkHttpClient;

/**
 * @author Mloong
 *         2017/7/25
 */
public class ReleaseStethoHelper implements StethoHelper {

    @Override
    public void init(Context context) {

    }

    @Override
    public OkHttpClient.Builder addNetworkInterceptor(OkHttpClient.Builder builder) {
        return null;
    }
}
