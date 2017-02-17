package com.didikee.hweather.network.services;

import com.didikee.hweather.network.HUrl;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by didik 
 * Created time 2017/2/7
 * Description: 
 */

public interface Weather7_10 {
    @GET(HUrl.Weather)
    Observable<String> get7_10Weather(@Query(HUrl.City) String city);
//    @GET(HUrl.Weather)
//    Observable<String> get7_10Weather(@Query(HUrl.Key)String key,
//                                      @Query(HUrl.City) String city);
}
