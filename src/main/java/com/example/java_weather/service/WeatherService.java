package com.example.java_weather.service;

import com.example.java_weather.mondels.Weather;

import java.util.List;

public interface WeatherService {

    public Weather getListeWeathers(String city) throws Exception;
}
