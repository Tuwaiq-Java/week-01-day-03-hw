package com.company;

public class calculateTax {
    private int price;
    private int reqTax;

    public calculateTax(int price) {
        this.price = price;

    }

    public int calculateTax1(int price) {
        this.price = price;

        try {
            if (price < 100 && price > 500)
                System.out.println("The price out of range!");
        }catch(Exception e){
            System.out.println(e);
        }

        return reqTax = (price * 15/100);
    }
    public String toString(){
        return "The ReqTax is : " + reqTax;
    }
    }
