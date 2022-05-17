package classDiagram;
public class circle {
    private double radius;

    public circle(){
        radius = 1.0;
    }
    public circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double pi = Math.PI;
        return pi;
    }

    public double getCircumference(){
        double pi = Math.PI;
        return pi;
    }

    public String toString(){
        return "Circle[radius=" + radius + "]";
    }
}
