package com.example.java_weather.dao;

import com.example.java_weather.dao.entity.ResponseWeatherAPIEntity;

public interface WeatherAPIDAO {
    public ResponseWeatherAPIEntity getListWeathers(String city);

    //ResponseWeatherAPIEntity getListeWeathers();
}
