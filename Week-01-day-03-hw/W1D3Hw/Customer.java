package Thw;

public class Customer {
    private int ID;
    private String name ;
    private char gender = 'm';


    public Customer(){

    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public Customer(int ID , String name , int discount ,  char gender){
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        discount = discount;

    }

    public String toString(){
        return "name " + name + "," + "(" + ID + ")";
    }






}
