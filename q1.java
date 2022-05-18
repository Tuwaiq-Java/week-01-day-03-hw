public class Main {
    public static void main(String[] args) {
        System.out.println(div(6,0));


    }
    public static int div(int num1, int num2){
        int result = 0;
        try{
            result = num1/num2;
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        return result;
    }
}