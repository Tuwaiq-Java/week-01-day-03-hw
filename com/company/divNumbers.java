package com.company;

public class divNumbers {
    private int number1;
    private int number2;
    private int result;

    public divNumbers(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1(){
        return number1;
    }

    public int getNumber2(){
        return number1;
    }

    public int div(int number1, int number2) {
        result = number1 / number2;
        try{
            if (number2 == 0)
                System.out.println("Divided by Zero!!");
        }
        catch (ArithmeticException e) {
            //System.out.println("Divided by Zero!!");
            System.out.println(e);

        }
        return result;
    }

    public String toString(){
        return "The division is: " + result;
    }

}
