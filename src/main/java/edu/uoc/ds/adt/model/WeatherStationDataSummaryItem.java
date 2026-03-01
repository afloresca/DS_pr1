package edu.uoc.ds.adt.model;

import lombok.Data;

@Data
public class WeatherStationDataSummaryItem {
    private double AccumulatedPrecipitation;
    private double MeanAvgAirTemperature;
    private int numRows;
    public WeatherStationDataSummaryItem(double precipSum, double meanTemp, int count){
        this.AccumulatedPrecipitation = precipSum;
        this.MeanAvgAirTemperature = meanTemp;
        this.numRows = count;
    }
}
