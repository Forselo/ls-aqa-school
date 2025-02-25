package ru.ls.qa.school.core;

public class PointTask {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(4, 6);

        double distance = point1.distance(point2);

        System.out.println("Расстояние между " + point1 + " и " + point2 + " равно: " + distance);
    }
}