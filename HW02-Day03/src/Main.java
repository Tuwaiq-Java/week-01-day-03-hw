import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

//      Question 1 testing:
        try{
            System.out.println(div(3,0));
        }
        catch (RuntimeException ex){
            System.out.println("Error, Division by zero");
        }

//        ====================================================
//        Question 2 testing:
        try {
            System.out.println(calculateTax(700.3));
        }
        catch (Exception e){
            System.out.println("Price must be between 100 and 500");
        }

//        =====================================================
//        Question 3 testing
        Circle circle = new Circle(8.66);
        System.out.println("Area: " + circle.getArea() +
                            "\nCircumference: " + circle.getCircumference());
        System.out.println(circle.toString());


//        =====================================================
//        Question 4 testing
        try {
            Customer customer = new Customer(612, "Khalid", 'F');
            customer.setGender('R');
            System.out.println(customer.toString());
        }
        catch (Exception e){
            System.out.println("Gender must be m or f");
        }
//        =================================================
//        Question 5 testing
        PolyLine line = new PolyLine();
        line.appendPoints(new Points(7, 8));
        line.appendPoints(12, 4);
        line.appendPoints(7, 3);
        System.out.println(line);
        ArrayList<Points> points = new ArrayList<Points>();
        points.add(new Points(23, 2));
        points.add(new Points(1, 56));
        PolyLine polyline = new PolyLine(points);
        System.out.println(polyline);
    }

//    Answer 1
    public static double div(double num1, double num2) throws RuntimeException{
        if(num2==0){
            throw new RuntimeException();
        }
        else
            return num1/num2;
    }

//    Answer 2
    public static double calculateTax(Double price) throws RuntimeException, Exception{
        double tax;
        if(price > 500 || price <100){
            throw new Exception();
        }
        else
            tax = price *15/100;
        return tax;
    }
}

