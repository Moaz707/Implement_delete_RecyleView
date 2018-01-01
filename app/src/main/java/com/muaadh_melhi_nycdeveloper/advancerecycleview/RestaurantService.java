package com.muaadh_melhi_nycdeveloper.advancerecycleview;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by rapier pc on 1/1/2018.
 */

public interface RestaurantService {
    //https://api.androidhive.info/json/menu.json

    @GET("json/menu.json")
    Call<Restaurant> getResturantInfo();
}
