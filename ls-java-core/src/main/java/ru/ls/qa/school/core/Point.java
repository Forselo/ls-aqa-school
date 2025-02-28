package ru.ls.qa.school.core;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point point) {
        double deltaX = this.x - point.getX();
        double deltaY = this.y - point.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}