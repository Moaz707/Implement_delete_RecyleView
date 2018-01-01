package com.muaadh_melhi_nycdeveloper.advancerecycleview;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rapier pc on 1/1/2018.
 */

public class JsonHelper {
    private static final String TAG =JsonHelper.class.getSimpleName() ;

    static List<Restaurant> getRestaurantInfoFromJSON(String jsonString){
        List<Restaurant> restaurantList = new ArrayList<>();
        try {
            JSONObject jsonObject=new JSONObject(jsonString);
            JSONArray list=jsonObject.getJSONArray("restaurant");
            //  Log.d(TAG, "onCreate: "+list.toString());
            for (int i = 0; i < list.length(); i++) {
                Restaurant restaurant=new Restaurant();

                JSONObject obj= (JSONObject) list.get(i);
                restaurant.setId(obj.getInt("id"));
                restaurant.setName(obj.getString("name"));
                restaurant.setDescription(obj.getString("description"));
                restaurant.setPrice(obj.getDouble("price"));
                restaurant.setThumbnail(obj.getString("thumbnail"));
                restaurantList.add(restaurant);
            }
            Log.d(TAG, "JsonHelper(0): "+restaurantList.size());
        } catch (JSONException e) {
            e.printStackTrace();
        }

       return null ;
    }
}
