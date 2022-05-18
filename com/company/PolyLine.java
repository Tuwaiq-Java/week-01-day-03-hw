package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private List<Point> points;
// every points in class Point
    public PolyLine(){
        points = new ArrayList<Point>();
    }

    public PolyLine(List<Point> points) {
        this.points = points;
    }

    public void appendPoint(int x, int y){
        Point newPoint = new Point(x, y);
        points.add(newPoint);
    }

    // add point to points
    public void appendPoint(Point point){
        points.add(point);
}

    public String toString(){
        StringBuilder s1 = new StringBuilder("{");
        for (Point aPoint : points) {
            s1.append(aPoint.toString());
        }
        s1.append("}");
        return s1.toString();
    }

}
