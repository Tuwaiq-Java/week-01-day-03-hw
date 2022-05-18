package com.company;

public class Point {
    private int x;
    private int y;
    private final int[] XY = new int[2];


    public Point(){
        x=0;
        y=0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    //Getter
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int[] getXY() {
        XY[0] = x; XY[1] = y;
        return XY;
    }

    //Setter
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y){
        return  Math.sqrt((y - this.y) * (y - this.y) + (x - this.x) * (x - this.x));

    }
    public double distance(Point another){
        return  Math.sqrt((another.getY() - this.y) * (another.getY() - this.y) + (another.getX() - this.x) * (another.getX() - this.x));

    }
    public double distance(){
        return  Math.sqrt((0 - this.y) * (0 - this.y) + (0 - this.x) * (0 - this.x));

    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }

}
