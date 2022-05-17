import java.util.Scanner;
public class calculateTax {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        try {
            System.out.println("Total bill cost:");
            double price=sc.nextDouble();
            double tax = calculateTax(price);
            System.out.println("Total bill cost with Tax : "+tax);
        }catch (Exception e) {
            System.out.println(e);

        }
    }
    static double calculateTax(double price) throws RuntimeException {
        if (price < 100 || price > 500) {
            throw new ArithmeticException("outside the range");
        }
        return price + 15 ;
    }
}