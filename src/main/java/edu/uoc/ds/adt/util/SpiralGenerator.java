package edu.uoc.ds.adt.util;

public class SpiralGenerator {
    public static Point[] generate(double a, double b, double thetaMax, double step) {
        int count = (int) Math.ceil(thetaMax / step);
        Point[] points = new Point[count];

        int index = 0;
        for (double theta = 0; theta <= thetaMax; theta += step) {
            // Polar equation: r = a + b * theta
            double r = a + b * theta;

            // Polar to Cartesian conversion
            double x = r * Math.cos(theta);
            double y = r * Math.sin(theta);

            points[index++] = new Point(x, y);
        }

        return points;
    }
}
