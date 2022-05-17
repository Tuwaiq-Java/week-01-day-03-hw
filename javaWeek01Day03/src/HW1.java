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

public class HW1 {


    public static void main(String[] args) {
        //HW-1
        try {
            System.out.println("********H1********");
            System.out.println("Div:" +div(10,0));
        }catch(RuntimeException e) {
            System.out.println(e);
        }

        // HW-2

        try {
            System.out.println("********H2********");
            System.out.println("Tax Calculated: "+calculateTax(150));
        } catch (Exception e) {
            System.out.println(e);
        }

        // HW-3
        System.out.println("********H3********");
        Circle c1 = new Circle(3);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        System.out.println(c1.getRadius());
        System.out.println(c1.toString());

        //HW-4
        System.out.println("********H4********");
        Customer customer = new Customer(1, "Salah", 'M');
        System.out.println(customer.getName());
        System.out.println(customer.getID());
        System.out.println(customer.getGender());
        System.out.println(customer.toString());

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
