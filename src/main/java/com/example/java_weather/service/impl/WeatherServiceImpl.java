package com.example.java_weather.service.impl;

import com.example.java_weather.dao.WeatherAPIDAO;
import com.example.java_weather.dao.entity.MainEntity;
import com.example.java_weather.dao.entity.ResponseWeatherAPIEntity;
import com.example.java_weather.mondels.Weather;
import com.example.java_weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    public WeatherAPIDAO weatherAPIDAO;
    @Override
    public  Weather getListeWeathers(String city ) throws Exception {
       ResponseWeatherAPIEntity response = weatherAPIDAO.getListWeathers(city);
    return transformEntityToModel(response);
    }

    private Weather transformEntityToModel(ResponseWeatherAPIEntity response) throws Exception {


        if ( response.getMains() == null )
        {throw new Exception("exception getWeeather!!!!!!!!!!!");  }


            Weather weathers = new Weather();

            weathers.setHumidity(response.getMains().getHumidity());
            weathers.setTemp(response.getMains().getTemp());
            weathers.setTemp_max(response.getMains().getTemp_max());
            weathers.setTemp_min(response.getMains().getTemp_min());
            weathers.setPressure(response.getMains().getPressure());



        return weathers;
    }
}
