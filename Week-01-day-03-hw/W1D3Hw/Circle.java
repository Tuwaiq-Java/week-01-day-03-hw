package Thw;

public class Circle {
    private double radius = 1.0 ;




    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(double area){
        area = Math.PI * radius *radius;
        return area;

    }
    public double getCircumference(double c) {
        c = (2) * Math.PI * radius;
        return c;

    }
    public String toString(){
       return "Circle [ " + "radius = " + radius;
    }
}
