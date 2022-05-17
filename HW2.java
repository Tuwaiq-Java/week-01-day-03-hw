
import java.util.ArrayList;
import java.util.Scanner;

class Circle {

    private double radius = 1.0;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return "The radius is: " + this.radius;
    }
}

class Customer {
    private int ID;
    private String name;
    private char gender;

    public Customer(int ID, String name, char gender, int discount) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return "The name is: " + this.name + ", with ID number: " + this.ID;
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

 class PolyLine {
    private ArrayList<Point> points;

     public PolyLine(ArrayList<Point> points) {
         this.points = points;
     }
     public void appendPoint(int x, int y) {
         Point point1 = new Point(x, y);
         points.add(point1);
     }
     public void appendPoint(Point point) {
         points.add(point);
     }

     public double getLength() {
         return this.points.size();
     }

     @Override
     public String toString() {
         return "PolyLine{" +
                 "points=" + points +
                 '}';
     }
 }




public class HW2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //الواجب الاول
        //Create method called " div " that takes two numbers and return division of these two numbers
        //
        //Your code should handle divide by zero exception error
        //The call of the method should know that this method could throw runtime exception
        System.out.println("Enter two numbers to get there division");
        try {
            System.out.println("The result: " + div(input.nextDouble(), input.nextDouble()));
        } catch (Exception e) {
            System.out.println("You cant divide by zero!");
        }


        System.out.println("!-----------------------------------------!");

        //الواجب الثاني
        //Create method called " calculateTax " that takes price between 100 - 500 and return the required tax for this price ( tax = price * 15/100 )
        //
        //Your code should throw exception when number outside the range is passed
        //The call of the method should know that this method could throw runtime exception
        //Your code should handle the exception error

        System.out.println("Enter a number between 100 - 500");
        try {
            System.out.println("Tax: " + calculateTax(input.nextInt()));
        } catch (Exception e) {
            System.out.println("Number is not in the range");
        }

        System.out.println("!-----------------------------------------!");
        //الواجب الثالث
        //circle class

//        HW2.Circle circleClass = new HW2.Circle();
        System.out.println("Enter a radius");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle.getArea());
        System.out.println("!-----------------------------------------!");

        //الواجب الرابع
        //The HW2.Customer class models a customer is design as shown in the class diagram. Write the codes for the HW2.Customer class and a test driver to test all the public methods.
        System.out.println("Enter a name, gender");
        String name = input.next();
        Customer customer = new Customer(0, name, 'm', 0);

        System.out.println(customer.toString());

        System.out.println("!-----------------------------------------!");


        //الواجب الخامس
        ArrayList<Point> points = new ArrayList<Point>();
        points.add(new Point(11, 12));
        points.add(new Point(13, 14));
        PolyLine polyLine = new PolyLine(points);
        System.out.println(polyLine);
        System.out.println("!-----------------------------------------!");



    }

    public static double div(double num1, double num2) {
        if (num2 == 0) {
            throw new RuntimeException();
        }
        return num1 / num2;
    }

    public static double calculateTax(int num) throws Exception {
        if (num > 500 || num < 100) {
            throw new RuntimeException();
        }
        return num * 0.15;
    }
}
