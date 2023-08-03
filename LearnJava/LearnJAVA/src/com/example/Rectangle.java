package com.example;

public class Rectangle
{
    private double width;
    private double height;

    Rectangle(){
        this(1.0,1.0);
    }

    Rectangle(double width,double height)
    {
        this.width = width;
        this.height = height;
    }

    public double getArea()
    {
        return (2 * this.height * this.width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
};
