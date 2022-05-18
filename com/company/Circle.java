package com.company;

public class Circle {
    private double radius;

    public Circle(){
        radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI;
    }
    public double getCircumference(){
        return Math.PI;
    }
    public String toString(){
        return "Circle[radius= " + radius + "]";
    }


}
