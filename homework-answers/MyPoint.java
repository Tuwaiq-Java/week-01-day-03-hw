package com.company;

public class MyPoint {

    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int arr[]={x,y};
        return arr;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(int x , int y){
        return Math.sqrt(Math.pow((this.x-x),2)+Math.pow((this.y-y),2));
    }

    public double distance(MyPoint myPoint){
        return Math.sqrt(Math.pow((this.x-myPoint.getX()),2)+Math.pow((this.y-myPoint.getY()),2));
    }

    public double distance(){
        return Math.sqrt(Math.pow((this.x-0),2)+Math.pow((this.y-0),2));
    }
}
