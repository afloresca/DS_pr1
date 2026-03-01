package edu.uoc.ds.adt;

import edu.uoc.ds.adt.model.WeatherStationData;
import edu.uoc.ds.adt.model.WeatherStationDataSummaryItem;
import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;

import lombok.Data;

@Data
public class PR1WeatherStationDataQueue {
    public final int CAPACITY = 10;
    private Queue<WeatherStationData> queue;
    private WeatherStationDataSummaryItem weatherStationDataSummaryItem;

    public PR1WeatherStationDataQueue(int size) {
        queue = new QueueArrayImpl<>(size);
    }

    public void add(WeatherStationData c) {
        this.queue.add(c);
    }

    /**
     * It calculates Mean precipitation
     * @return double value of mean precipitation
     */
    public double getMeanPrecipitation() {
        double avg = 0.0;
        Queue<WeatherStationData> q = getQueue();
        int size = q.size();
        if (size == 0) return avg; // avg = 0.0;
        WeatherStationData[] temp = new WeatherStationData[size];
        double sum = 0.0;

        // Poll all elements and store them temporarily
        for (int i = 0; i < size; i++) {
            WeatherStationData data = q.poll();
            sum += data.getPrecipitation();
            temp[i] = data;
        }

        for (WeatherStationData data : temp) {
            q.add(data);
        }

        avg =  sum / size;
        return avg;
    }

    /**
     * This method calculates Mean Avg Air Temperature
     * @return double with mean average air temperature
     */
    public double getMeanAvgAirTemperature() {
        double avg = 0.0;
        Queue<WeatherStationData> q = getQueue();
        int size = q.size();
        if (size == 0) return avg; // avg = 0.0;

        WeatherStationData[] temp = new WeatherStationData[size];
        double sum = 0.0;

        for (int i = 0; i < size; i++) {
            WeatherStationData data = q.poll();
            sum += data.getAvgAirTemperature();
            temp[i] = data;
        }

        for (WeatherStationData data : temp) {
            q.add(data);
        }

        avg = sum / size;
        return avg;
    }

    /**
     * Builds a summary item for a given year, containing accumulated precipitation,
     * mean average air temperature, and number of records for that year.
     *
     * @param year the year to filter by
     * @return a WeatherStationDataSummaryItem with the computed values
     */
    public WeatherStationDataSummaryItem getWeatherStationDataSummaryItem(int year) {
        Queue<WeatherStationData> q = getQueue();
        int size = q.size();

        WeatherStationData[] temp = new WeatherStationData[size];
        double precipSum = 0.0;
        double tempSum = 0.0;
        int count = 0;

        // Poll all elements, filter by year, and accumulate
        for (int i = 0; i < size; i++) {
            WeatherStationData data = q.poll();
            if (data.getLastUpdated().getYear() == year) {
                precipSum += data.getPrecipitation();
                tempSum += data.getAvgAirTemperature();
                count++;
            }
            temp[i] = data;
        }


        for (WeatherStationData data : temp) {
            q.add(data);
        }

        double meanTemp = count == 0 ? 0.0 : tempSum / count;

        return new WeatherStationDataSummaryItem(precipSum, meanTemp, count);
    }
}
