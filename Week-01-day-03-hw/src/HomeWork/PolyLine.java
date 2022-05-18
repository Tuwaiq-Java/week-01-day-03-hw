package HomeWork;

import java.awt.*;
import java.util.ArrayList;

public class PolyLine {
    private ArrayList <Point> points=new ArrayList<>();

    public PolyLine() {
    }

    public PolyLine(ArrayList<Point> points) {
        this.points = points;
    }

    public void appendPoint (int x , int y){
        this.points.add(new Point(x,y));
    }

    public void appendPoint (Point point){
        this.points.add(point);
    }

    @Override
    public String toString() {
        return "PolyLine{" +
                "points=" + points +
                '}';
    }

    public double getLength(){
        return this.points.size();
    }
}
