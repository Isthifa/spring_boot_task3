package com.isthifa.oops.abstra;

public class Rectangle extends Shape{
    private double length;
    private double width;
    private String color;
    public Rectangle()
    {

    }

    public Rectangle(String color, double length, double width) {
        this.color=color;
        this.length = length;
        this.width = width;
    }

    public void setColor(String color)
    {
        this.color=color;
    }
    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
