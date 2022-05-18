package HomeWork;

import java.awt.*;
import java.util.ArrayList;

public class Answers {

    public static void main(String[] args) {

        try{
          System.out.println(div(1,-2));
          System.out.println(calculateTax(20));
        }catch (Exception e){
            System.out.println(e);
        }

//        ------------------------------------------------------------------
        Customer customer = new Customer(11,"Amaal",'f');
        System.out.println(customer.toString());

//        ------------------------------------------------------------------
        ArrayList<Point>points = new ArrayList<>();

        points.add(new Point(3,4));
        points.add(new Point(8,10));

        PolyLine polyline = new PolyLine(points);
        System.out.println("we have "+polyline.getLength()+" points");

    }

    public static int div(int num1,int num2) throws ArithmeticException{
        if (num1<0 || num2<0){
            throw new ArithmeticException("Please Enter positive number");
        }
        return num1/num2;
    }

    public static double calculateTax(int price) throws Exception {
        if(price<100&&price>500){
            throw new Exception("price out of range");
        }
    return price*0.15;
    }
}
