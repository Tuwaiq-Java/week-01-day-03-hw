
package javaApplication2;
import java.util.*;


public class JavaApplication2 {
    public static void main(String[] args) {
     
// Question 1 ***********************


      try{
          System.out.println(div(33,0));
      }catch(RuntimeException e){
          System.out.println(e);
      }
      
      
      
      //  Question 2 ***********************
      
          System.out.println(calculateTax(100, 300));
          
          
          
          
          //  Question 3 ***********************
     
              Circle C1= new Circle(1.0);
              C1.setRadius(1.0);
              System.out.println(C1.getRadius());
              System.out.println(C1.tostring());
              
              
          //  Question 4 ***********************
          Customer CU1= new Customer(2, "Ryan Awaji", 'm');
          
          
          
          //  Question 5 ***********************
          
        PolyLine po1 = new PolyLine();
        System.out.println(po1);
        
        po1.appendPoints((7, 8));
        po1.appendPoints(13, 8);
        po1.appendPoints(26, 9);
     
        ArrayList<Points> po2 = new ArrayList<Points>();
        po2.add((21, 14));
        po2.add((12, 10));
        PolyLine po = new PolyLine();
        System.out.println(po);
    }
          
          
          
         
          

              
   
    }
    
    // Question 1 ******************** 
    
    public static int div(int num1, int num2) throws RuntimeException{
        return num1 / num2;
   }
    
    
     // Question 2 ******************** 
    
    public static double calculateTax(int price, int tax) throws RuntimeException {
       int result;
        result = tax = price * 15/100;
        if(result > 500 ){
            throw new RuntimeException("RuntimeException Because The Calcolate Number 1 Is Small From 500");
        }
        return result;
    }
    
    
  
}
    // Question 3 ******************** 

    public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
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
        return Math.PI*Math.pow(radius,2);
    }
    public double getCircumference() {
        return 2*Math.PI*radius;
    }

    public String tostring() {
        return "Circle " + "radius " + radius ;
               
    }
    
    
    // Question 4 ******************** 
    
    public class Customer {
    private int ID;
    private String name;
    private char gender;
    public Customer(int ID, String name,char gender) {
        this.ID = ID;
        this.name = name;
        this.gender=gender;
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
        return "Name(ID) "+ name;
    }
}
      // Question 5 ******************** 
    

public class PolyLine {
    ArrayList <points>points;
    private int x;
    private int y;


    public PolyLine(ArrayList <points>points) {
        this.ArrayList<points>points=ArrayList <points>points;
    }

    public PolyLine(ArrayList<points> points) {
        this.points = points;
    }

    public void appendPoints(int x, int y){
        this.x=x;
        this.y=y;
        
    }

    public void appendPoints(points p){
        po1.add(p);
    }

    public double getLength(){
        return ArrayList <points>points;
    }

    public String toString() {
        String S1 = "";
        for(points point: points){
            S1 = S! + point.toString();
        }
        return S1;
    }
}
