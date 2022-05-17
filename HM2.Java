// # الواجب الاول

// Create method called " div " that takes two numbers and return division of these two numbers 

// - Your code should handle divide by zero exception error
// - The call of the method should know that this method could throw runtime exception

//Answer1 :

public class Answer1 {
    public static void main(String[] args) {
                int a = 5;
                int b = 0;
                try {
                    System.out.println(a / b);
                }
                catch (ArithmeticException e) {
                    System.out.println("Divided by zero operation cannot possible");
                }
    }
    public static int div(int a, int b) throws ArithmeticException {
        if(a ==0 || b == 0) {
            throw new ArithmeticException();
        }
        return a/b;
    }
}


// # الواجب الثاني

// Create method called " calculateTax " that takes price between 100 - 500 and return the required tax for this price ( tax = price * 15/100 )

// - Your code should throw exception when number outside the range is passed
// - The call of the method should know that this method could throw runtime exception
// - Your code should handle the exception error

//Answer2 : 

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);


        try {
            System.out.println("Total bill cost:");
            double price=in.nextDouble();
            double tax = calculateTax(price);
            System.out.println("Total bill cost with Tip : "+tax);
        }catch (Exception e) {
            System.out.println(e);

        }
    }
    static double calculateTax(double price) throws RuntimeException {
        if (price < 100 || price > 500) {
            throw new ArithmeticException("Not good");
        }
        return price * 15 / 100;
    }
}


//# الواجب الثالث

//Answer3 : 

public class Main {
    public static void main(String[] args) {
        Circle cir = new Circle(0.9d);

        double radius = cir.getRadius();
        cir.setRadius(0.0E00);
        double Area = cir.getArea();
        double Circumference = cir.getCircumference();
        System.out.println(cir.toString());
    }
}


public class Circle {
    private double radius;

    public Circle(){
        radius = 1.0;
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


// # الواجب الرابع

// The `Customer` class models a customer is design as shown in the class diagram. 
// Write the codes for the `Customer` class and a test driver to test all the `public` methods.

//Answer4 :

public class Main {
    public static void main(String[] args) {
        Customer cus = new Customer(4, "FaisalMS", 'M');

        int id = cus.getId();
        String name = cus.getName();
        char gender = cus.getGender();

        System.out.println(cus.toString());
    }
}

import static javax.swing.text.html.parser.DTDConstants.ID;

public class Customer {
    private int Id;
    private String name;
    private char gender;

    public Customer(int id, String name, char gender) {
        Id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString(){
        return ""+ name + "(" + ID + ")";
    }
}


//# الواجب الخامس

//Answer5 :

public class Main {
    public static void main(String[] args) {
        PolyLine pl = new PolyLine();
        PolyLine pl1 = new PolyLine();

        System.out.println(pl.toString());
        
    }
}


import java.awt.*;
import java.util.ArrayList;

public class PolyLine {
    private ArrayList<Point>points;
    private int x;
    private int y;

    public PolyLine(){
        this.points = new ArrayList<Point>();
    }

    public PolyLine(ArrayList<Point>points){
        this.points = points;
    }
    public void appendPoint(int x,  int y){
        this.appendPoint(x, y);
    }

    public void appendPoint(ArrayList<Point>point){
        this.appendPoint(x,y);
    }

    public String toString(){
       return "{(" + x + "1,"+ y + "1)(" + x + "2," + y + "2)("+ x + "3,"+ y +"3)...}" ;
    }
}