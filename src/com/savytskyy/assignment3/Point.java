package com.savytskyy.assignment3;

import java.util.Objects;

public class Point {
    private double x, y;
    private String s;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //getters
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    //setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    //distance method
    public double distance(Point point) {
        double dx = x - point.x;
        double dy = y - point.y;

        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    @Override
    public String toString() {
        return "Point ( " + x + ", " + y + " )";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj.getClass() != Point.class) return false;
        //if (!(obj instanceof Point)) return false;
        //not advisable: could pass a superclass instance

        Point p = (Point) obj;
        return p.x == x && p.y == y && Objects.equals(s, p.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
