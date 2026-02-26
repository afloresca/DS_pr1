package edu.uoc.ds.adt;

import edu.uoc.ds.adt.dto.WeatherStationData;
import edu.uoc.ds.adt.sequential.Queue;
import lombok.Data;

@Data
public class PR1WeatherStationDataQueue {
    public final int CAPACITY = 10;
    private int size;
    private int[] ints;
    private Queue<WeatherStationData> queue;

    public PR1WeatherStationDataQueue(int size, int[] ints) {
        this.size = size;
        this.ints = ints;
    }



}
