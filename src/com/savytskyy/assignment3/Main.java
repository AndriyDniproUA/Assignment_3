package com.savytskyy.assignment3;

public class Main {

    public static void main(String[] args) {

        PointList pointList = new PointList();
        pointList.add(new Point(1,5));
        pointList.add(new Point(3,6));
        pointList.add(new Point(4,6));
        pointList.add(new Point(4,6));
        pointList.add(new Point(5,6));
        pointList.add(new Point(6,6));
        pointList.add(new Point(7,6));
        //pointList.add(new Point(8,6));
        //pointList.add(new Point(9,6));
        //pointList.add(new Point(10,6));
        //pointList.add(new Point(11,6));
        //pointList.add(new Point(12,6));
        //pointList.add(new Point(13,6));
        //pointList.add(new Point(14,6));



        for (int i = 0; i < pointList.getLastElementIndex(); i++) {
            System.out.println(pointList.get(i));
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < pointList.size(); i++) {
                System.out.println(pointList.get(i));
        }








    }
}
