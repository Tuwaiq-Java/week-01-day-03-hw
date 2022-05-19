package com.company;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {

    List<Point> points;

    public PolyLine(List<Point> points) {
        this.points = points;
    }

    public PolyLine() {
        points=new ArrayList<>();
    }


    public void appendPoint(int x , int y){
        Point point=new Point(x, y);
        points.add(point);
    }

    public void appendPoint(Point point){
        points.add(point);
    }

    @Override
    public String toString() {
        return "{" +
                  points +
                '}';
    }

    public double getLength(){
        return points.size();
    }
}
