package com.company;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //EX1
       divNumbers divNum = new divNumbers(5,0);
        //divNum.div(5,0);
        System.out.println(divNum.toString());

        //EX2
        calculateTax calcTax = new calculateTax(100);
        System.out.println(calcTax.toString());

        //EX3

        Circle circle = new Circle(5.5);
        System.out.println(circle.toString());

        //EX4

        Customer customer = new Customer(123,"Haneen",10);
        System.out.println(customer.toString());

        //EX5

     PolyLine l1 = new PolyLine();
     System.out.println(l1);

     l1.appendPoint(new Point(1, 5));
     l1.appendPoint(7, 2);
     l1.appendPoint(1, 3);
     // here run the toString method
     System.out.println(l1);

     ArrayList<Point> points = new ArrayList<Point>();
     points.add(new Point(11, 12));
     points.add(new Point(13, 14));
     PolyLine l2 = new PolyLine(points);
     System.out.println(l2);


    }
}