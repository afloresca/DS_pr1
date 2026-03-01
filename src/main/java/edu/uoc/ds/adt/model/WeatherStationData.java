package edu.uoc.ds.adt.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class WeatherStationData {
    private LocalDateTime lastUpdated;
    private String stationName;
    private String province;
    private double latitude;
    private double longitude;
    private double avgAirTemperature;
    private double precipitation;
    private double minAirTemperature;
    private double maxAirTemperature;

    public WeatherStationData(LocalDateTime lastUpdated, String s, String s1, double v, double v1, double avgAirTemperature, double precipitation, double minAirTemperature, double maxAirTemperature) {
        this.lastUpdated = lastUpdated;
        this.stationName = s;
        this.province = s1;
        this.latitude = v;
        this.longitude = v1;
        this.avgAirTemperature = avgAirTemperature;
        this.precipitation = precipitation;
        this.minAirTemperature = minAirTemperature;
        this.maxAirTemperature = maxAirTemperature;
    }

}
