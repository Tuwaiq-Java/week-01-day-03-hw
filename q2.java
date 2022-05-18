public class Hw2 {
    public static void main(String[] args) {
        calculateTax(200);
        try{
            System.out.println(calculateTax(200));
        }catch (RuntimeException e){
            System.out.println(e);
        }


    }
    public static double calculateTax(double price) throws RuntimeException{
        double taxed;

            if(price <100 || price > 500)
                throw new RuntimeException("Price is out of range");

            taxed = price*(0.15);


        return taxed;
    }

}
