package edu.uoc.ds.adt.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class WeatherStationData {
    private LocalDateTime lastUpdated;
    private String s;
    private String s1;
    private double v;
    private double v1;
    private double avgAirTemperature;
    private double precipitation;
    private double minAirTemperature;
    private double maxAirTemperature;
    public WeatherStationData(LocalDateTime lastUpdated, String s, String s1, double v, double v1, double avgAirTemperature, double precipitation, double minAirTemperature, double maxAirTemperature) {
        this.lastUpdated = lastUpdated;
        this.s = s;
        this.s1 = s1;
        this.v = v;
        this.avgAirTemperature = avgAirTemperature;
        this.precipitation = precipitation;
        this.minAirTemperature = minAirTemperature;
        this.maxAirTemperature = maxAirTemperature;
    }
}
