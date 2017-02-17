package com.didikee.hweather.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by didik 
 * Created time 2017/2/7
 * Description: 
 */

public final class HttpService {
    private static final long DEFAULT_TIMEOUT = 10;
    private Retrofit retrofit;

    private static class Singleton {
        private static final HttpService INSTANCE = new HttpService();
    }

    public static HttpService getInstance() {
        return Singleton.INSTANCE;
    }

    private HttpService() {
        //手动创建一个OkHttpClient并设置超时时间
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
        httpClientBuilder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        CommonParamsInterceptor paramsInterceptor = new CommonParamsInterceptor();
        httpClientBuilder.addInterceptor(interceptor)
                .addInterceptor(paramsInterceptor)
                .build();

        retrofit = new Retrofit.Builder()
                .client(httpClientBuilder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(HUrl.BaseUrl)
                .build();
    }

    public <T> T create(final Class<T> service) {
        return retrofit.create(service);
    }
}
