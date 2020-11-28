package com.savytskyy.assignment3;

public class Main {

    public static void main(String[] args) {

        PointList pointList = new PointList();
        pointList.add(new Point(1,5));
        pointList.add(new Point(2,6));

        for (int i = 0; i < pointList.size(); i++) {
                System.out.println(pointList.get(i));
        }
    }
}
