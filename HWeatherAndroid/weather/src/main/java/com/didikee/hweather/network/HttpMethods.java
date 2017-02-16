package com.didikee.hweather.network;

import com.didikee.hweather.network.services.Weather7_10;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by didik 
 * Created time 2017/2/7
 * Description: 
 */

public class HttpMethods {
    private static class Singleton {
        private static final HttpMethods INSTANCE = new HttpMethods();
    }

    public static HttpMethods getInstance() {
        return Singleton.INSTANCE;
    }

//    public void getTopMovie(Subscriber<DouBan> subscriber, int start, int count) {
//        HttpService.getInstance().create(RxDouBanService.class)
//                .getDouBanTop250(start, count)
//                .subscribeOn(Schedulers.io())
//                .unsubscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(subscriber);
//    }
    public void get7_10Weather(String city,Subscriber<String> subscriber){
        HttpService.getInstance().create(Weather7_10.class)
                .get7_10Weather("beijing")
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

}
