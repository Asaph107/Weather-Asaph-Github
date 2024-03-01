package com.example.java_weather.dao.impl;

import com.example.java_weather.dao.WeatherAPIDAO;
import com.example.java_weather.dao.entity.ResponseWeatherAPIEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class WeatherAPIDAOImpl implements WeatherAPIDAO {

    @Autowired
    private RestTemplate restTemplate;
    @Override
    public ResponseWeatherAPIEntity getListWeathers(String city) {
        String URL_API_OPEN_DATA = "https://api.openweathermap.org/data/2.5/weather?q="+city+"&units=metric&appid=42a4f7541a09c36149c0692056925e82";

        return restTemplate.getForEntity(URL_API_OPEN_DATA, ResponseWeatherAPIEntity.class).getBody();
    }
}
