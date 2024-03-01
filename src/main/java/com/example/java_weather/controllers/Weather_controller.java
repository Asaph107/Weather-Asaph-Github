package com.example.java_weather.controllers;

//import com.example.java_weather.dao.entity.ResponsAPI;
import com.example.java_weather.mondels.Weather;
import com.example.java_weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class Weather_controller {

    @Autowired
    private WeatherService weatherService;

    @CrossOrigin("*")
    @RequestMapping(path = "/api/weather", method = RequestMethod.GET)
        public Weather getListeWeathers(@RequestParam String city) throws Exception {
            return weatherService.getListeWeathers(city);
          //  ResponsAPI responsAPI = new ResponsAPI();
//        try {
//            responsAPI.setStatus(100);
//            responsAPI.setMessage("success");
//            responsAPI.setData(weatherService.getListeWeathers());
//            return new ResponseEntity<>(responsAPI, HttpStatus.OK);
//        }
//        catch (Exception e){
//            responsAPI.setStatus(101);
//            responsAPI.setMessage(e.getMessage());
//            return new ResponseEntity<>(responsAPI, HttpStatus.BAD_REQUEST);
//        }
    }


}
