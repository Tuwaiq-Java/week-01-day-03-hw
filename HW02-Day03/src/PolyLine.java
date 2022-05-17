
import java.util.ArrayList;


public class PolyLine {
    ArrayList <Points>points;


    public PolyLine() {
        points = new ArrayList<Points>();
    }

    public PolyLine(ArrayList<Points> points) {
        this.points = points;
    }

    public void appendPoints(int x, int y){
        Points point = new Points(x,y);
        points.add(point);
    }

    public void appendPoints(Points p){
        points.add(p);
    }

    public double getLength(){
        return points.size();
    }

    @Override
    public String toString() {
        String res = "";
        for(Points point: points){
            res = res + point.toString();
        }
        return res;
    }
}
