package HomeWork;

import java.awt.*;
import java.util.ArrayList;

public class PolyLine {
    private ArrayList <MyPoint> points=new ArrayList<>();

    public PolyLine() {

    }

    public PolyLine(ArrayList<MyPoint> points) {
        this.points = points;
    }

    public void appendPoint (int x , int y){
        this.points.add(new MyPoint(x,y));
    }

    public void appendPoint (MyPoint point){
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
