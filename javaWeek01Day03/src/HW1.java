import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class Customer {
    private int ID;
    private String name;
    private char gender;

    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return this.name+"("+this.ID + ")";
    }
}
class Circle {
    private double radius = 1.0;
    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

class Point {
    private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class PolyLine{
    private List<Point> points ;

    public PolyLine() {
        this.points = new ArrayList<>();
    }

    public PolyLine(List<Point> points) {
        this.points = new ArrayList<>(points);
    }

    public void appendPoint(int x, int y ) {
        this.points.add(new Point(x,y));
    }

    public void appendPoint(Point point) {
        this.points.add(point);
    }

    public int getLength() {
        return this.points.toArray().length;
    }

    public String toString() {
        String str = "{";
        for (int i = 0; i < this.getLength(); i++) {
            str += "(" + this.points.get(i).getX() + "," +this.points.get(i).getY() + ")";
        }
        str+="}";
        return str;
    }

}

public class HW1 {


    public static void main(String[] args) {
        //HW-1
        try {
            System.out.println("********H1********");
            System.out.println("div(): " +div(10,5));
        }catch(RuntimeException e) {
            System.out.println("Exception: "+ e);
        }

        // HW-2

        try {
            System.out.println("\n********H2********");
            System.out.println("calculateTax(): "+calculateTax(150));
        } catch (Exception e) {
            System.out.println(e);
        }

        // HW-3
        System.out.println("\n********H3********");
        Circle c1 = new Circle(3);
        System.out.println("getArea(): "+c1.getArea());
        System.out.println("getCircumference(): "+c1.getCircumference());
        System.out.println("getRadius(): "+c1.getRadius());
        System.out.println("toString(): "+c1.toString());

        //HW-4
        System.out.println("\n********H4********");
        Customer customer = new Customer(1, "Salah", 'M');
        System.out.println("getName(): "+customer.getName());
        System.out.println("getID(): "+customer.getID());
        System.out.println("getGender(): "+customer.getGender());
        System.out.println("toString(): "+customer.toString());

        //HW-5
        System.out.println("\n********H5********");
        PolyLine pl = new PolyLine();
        pl.appendPoint(new Point(5,4));
        System.out.println("getLength(): "+pl.getLength());
        pl.appendPoint(new Point(3,7));
        System.out.println("getLength(): "+pl.getLength());
        System.out.println("toString(): "+ pl.toString());

    }

    public static int div(int n1, int n2) throws ArithmeticException {
        if(n1 ==0 || n2 == 0) {
            throw new ArithmeticException();
        }
        return n1/n2;
    }

    public static double calculateTax (int price) throws Exception{
        if(price < 100 || price > 500) {
            throw new RuntimeException("Outside of range");
        }

        return price * 15/100;

    }
}
