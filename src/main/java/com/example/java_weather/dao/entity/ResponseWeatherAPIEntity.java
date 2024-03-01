package com.example.java_weather.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ResponseWeatherAPIEntity {

    @JsonProperty(value = "main")
    public MainEntity mains;

    public MainEntity getMains() {
        return mains;
    }

    public void setMains(MainEntity mains) {
        this.mains = mains;
    }
}