package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;
import edu.uoc.ds.adt.util.Point;

public class PR1Queue {

    public final int CAPACITY = 10;

    private Queue<Point> queue;

    public PR1Queue() {
        newQueue();
    }

    public PR1Queue(int n) {
        queue = new QueueArrayImpl<>(n);
    }

    public void newQueue() {
        queue = new QueueArrayImpl<>(CAPACITY);
    }

    public Queue<Point> getQueue() {
        return this.queue;
    }

    public void add(Point c) {
        this.queue.add(c);
    }

    public Point poll() {
        return this.queue.poll();
    }
}
