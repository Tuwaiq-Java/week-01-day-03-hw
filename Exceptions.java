package com.company;

public class Exceptions {

    public static void main(String[] args)  {

        // Types of errors in programming
        // 1- Syntax error
        // 2- Runtime error
        // 3- Logical error

//        1- Syntax error
//        if{
//        }
//        String 2name="saleh";
//        swicht

//        2- Runtime error
//        int arr[]=new int[3];
//        System.out.println(arr[3]);
//        String name= null;
//        System.out.println(name.toUpperCase());

//        3- Logical errors
//        System.out.println(sum(6,3));


//        Handling runtime error
//        int arr[]=new int[3];
//        try {
//            System.out.println("First line of try block");
//            System.out.println(arr[3]);
//            System.out.println("Last line of try block");
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
//        try {
//            System.out.println("First line of try block");
//            System.out.println(5/0);
//            System.out.println("Last line of try block");
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }catch (ArithmeticException e){
//            System.out.println(e);
//        }
//        try {
//            System.out.println("First line of try block");
//            System.out.println(5/0);
//            System.out.println("Last line of try block");
//        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
//            System.out.println(e);
//        }
//        try {
//            System.out.println("First line of try block");
//            System.out.println(5/0);
//            System.out.println("Last line of try block");
//        }catch (Exception e){
//            System.out.println(e);
//        }
//        try {
//            System.out.println("First line of try block");
//            System.out.println(5);
//            System.out.println("Last line of try block");
//        }catch (ArithmeticException e){
//            System.out.println(e);
//        } finally {
//            System.out.println("Hey from finally");
//        }
//        throw new ArithmeticException("Please enter valid numbers");
//        System.out.println(sumPositiveNumbers(1, 0));
//        System.out.println(name.charAt());
    }


    public static  int sumPositiveNumbers(int number1, int number2)
            throws Exception  {
        if(number1<0 || number2 <0 ){
            throw new Exception("Please only send positive numbers");
        }
        return number1+number2;
    }

    public static int sum(int number1, int number2) {
        return number1/number2;
    }


}
