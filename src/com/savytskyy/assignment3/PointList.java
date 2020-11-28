package com.savytskyy.assignment3;

import java.util.Arrays;

public class PointList {

    int lastElement = 0;
    int capacity = 4;
    Point[] points = new Point[capacity];


    public void add(Point p) {
        //points = Arrays.copyOf(points, points.length+1);
        //points[points.length-1] = p;

        Point[] buffer = new Point[points.length + 1];
        for (int i = 0; i < points.length; i++) {
            buffer[i] = points[i];
        }
        buffer[buffer.length - 1] = p;
        points = buffer;
    }

    public Point get(int index) {
        checkValidIndex(index);
        return points[index];
    }

    public void set(Point p, int index) {
        checkValidIndex(index);
        this.points[index] = p;
    }

    public void remove(int index) {
        checkValidIndex(index);

        Point[] buffer = new Point[points.length - 1];
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = points[i < index ? i : i + 1];
        }
        points = buffer;
    }

    public int size () {
        return points.length;
    }


    private void checkValidIndex(int index) {
        if (index >=points.length || index <0) {
            throw new IndexOutOfBoundsException();
        }
    }
}
