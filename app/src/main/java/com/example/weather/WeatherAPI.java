package com.example.weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherAPI {
    @GET("weather?lat=50&lon=50&appid=e83640a72bfcaf742e1222e4d0bb5ace&units=metric")
    Call<OpenWeatherMap>getWeatherWithLocation(@Query("lat")double lat, @Query("lon")double lon);

    @GET("weather?lat=50&lon=50&appid=e83640a72bfcaf742e1222e4d0bb5ace&units=metric")
    Call<OpenWeatherMap>getWeatherWithCityName(@Query("q")String name);
}
