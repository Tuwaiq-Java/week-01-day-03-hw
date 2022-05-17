import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println(div(4,0));
    }
    public static int div(int num1,int num2) throws RuntimeException{
        if(num2 == 0){
            throw new ArithmeticException("input Not valid");
        }
        return num1/num2;
    }
}