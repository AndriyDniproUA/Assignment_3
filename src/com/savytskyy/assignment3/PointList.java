package com.savytskyy.assignment3;

public class PointList {

    private int lastElement = 0;
    private int capacity = 4;
    Point[] points = new Point[capacity];


    public void add(Point p) {
        //points = Arrays.copyOf(points, points.length+1);
        //points[points.length-1] = p;

        if (lastElement == capacity) {
            capacity = (int) (capacity *1.5);
            this.arrayResize((int) (capacity));
        }

        points[lastElement] = p;
        lastElement++;
    }

    public void arrayResize (int size) {
        Point[] buffer = new Point[size];
        for (int i = 0; i <= lastElement-1; i++) {
            buffer[i] = points[i];
        }
        points = buffer;
    }

    public Point get(int index) {
        this.checkValidIndex(index);
        return points[index];
    }

    public void set(Point p, int index) {
        this.checkValidIndex(index);
        this.points[index] = p;
    }

    public void remove(int index) {
        this.checkValidIndex(index);

        Point[] buffer = new Point[points.length - 1];
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = points[i < index ? i : i + 1];
        }
        points = buffer;
    }

    public int size () {
        return points.length;
    }

    public int getLastElementIndex () {
        return lastElement;
    }


    private void checkValidIndex(int index) {
        if (index >=points.length || index <0) {
            throw new IndexOutOfBoundsException();
        }
    }
}
