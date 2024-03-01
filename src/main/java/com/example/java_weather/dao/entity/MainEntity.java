package com.example.java_weather.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MainEntity {

    @JsonProperty(value = "temp")
    private double temp;

    @JsonProperty(value = "temp_min")
    private double temp_min;

    @JsonProperty(value = "temp_max")
    private double temp_max;

    @JsonProperty(value = "pressure")
    private int pressure;

    @JsonProperty(value = "humidity")
    private double humidity;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public MainEntity(double temp, double temp_min, double temp_max, int pressure, int humidity) {
        this.temp = temp;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
    //     "temp": 1.21,
//             "feels_like": -3.75,
//             "temp_min": 0.38,
//             "temp_max": 1.8,
//             "pressure": 1017,
//             "humidity": 95

}
