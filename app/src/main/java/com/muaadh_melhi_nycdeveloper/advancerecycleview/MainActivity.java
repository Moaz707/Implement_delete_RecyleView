package com.muaadh_melhi_nycdeveloper.advancerecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    //private final String BASE_URL="https://api.androidhive.info/";
    //https://www.androidhive.info/2017/09/android-recyclerview-swipe-delete-undo-using-itemtouchhelper/
    private String TAG=MainActivity.class.getSimpleName();
    private List<Restaurant> restaurantList;
    private String jsonString=Constants.jsonInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     JsonHelper.getRestaurantInfoFromJSON(jsonString);


    }
}






/**
 //         * Bulit Retrofit and getting the data through 3 Steps:
 //         */
//        //Step 1
//        Retrofit retrofit=new Retrofit.Builder()
//                .baseUrl("https://api.androidhive.info/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        //Step 2
//        RestaurantService service=retrofit.create(RestaurantService.class);
//        //Step 3
//        Call<Restaurant> call=service.getResturantInfo();
//        call.enqueue(new Callback<Restaurant>() {
//            @Override
//            public void onResponse(Call<Restaurant> call, Response<Restaurant> response) {
//
//               restaurantList=new ArrayList<>();
//                restaurantList.add( response.body());
//                Log.d(TAG, "onResponse: "+restaurantList.get(0).getName());
//            }
//
//            @Override
//            public void onFailure(Call<Restaurant> call, Throwable t) {
//                Log.d(TAG, "onFailure: "+"<<<<<<<>>>>>>>>>>>>>>>>");
//
//            }
//        });
