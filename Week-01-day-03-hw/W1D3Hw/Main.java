package Thw;

import javafx.scene.effect.Light;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        System.out.println("-----------Question 1-----------");
        System.out.println("the div of these two no. " + div(6,0));


        System.out.println("-----------Question 2-----------");
        System.out.println("the price tax is : " + calculateTax(5));


        System.out.println("-----------Question 3-----------");
        Circle circle = new Circle();
        circle.setRadius(3.5);
        System.out.println("Circle's radius is " + circle.getRadius());
        System.out.println("The area of the Circle is : " + circle.getArea(3.0));
        System.out.println(" the circumference of the circle " + circle.getCircumference(5.0));
        System.out.println(circle.toString());


        System.out.println("-----------Question 4-----------");
        Customer customer = new Customer(1234 , "Turki " , 10 , 'm');
        System.out.println("The Customer ID is : " + customer.getID());
        System.out.println("The Customer name is : " + customer.getName());
        System.out.println("The Customer Gender is : " + customer.getGender());
        System.out.println(customer.toString());


        System.out.println("-----------Question 5-----------");
        ArrayList<Point> pointArrayList = new ArrayList<Point>(1);
        PolyLine polyLine = new PolyLine();
         polyLine.appendPoint(5,6);
         polyLine.appendPoint(1,4);
        //System.out.println("the length is  : " + polyLine.getLength());





    }

    public static double div(double num1 , double num2) throws RuntimeException{
       try {
           return num1 / num2;
       } catch (RuntimeException Re ){
           if(num1== 0 & num2 == 0 ){
               System.out.println(" you cannot div zero!!!" + Re);
               Re.getMessage();

           }
       }

return num1/num2;
    }

    public static int calculateTax(int price) throws RuntimeException{
        try {
            price = price * 15/100;
            return price;
        } catch (RuntimeException Re){
            Re.getMessage();

        }

        return price;

    }


}