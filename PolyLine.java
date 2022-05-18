import java.util.List;

public class PolyLine {
    private List<Point> points;

    public PolyLine() {
    }

    public PolyLine(List<Point> points) {
        this.points = points;
    }
    public void appendPoint(int x, int y){
        Point point1 = new Point(x,y);
        points.add(point1);
    }
    public void appendPoint(Point point){
        points.add(point);
    }


    public String toString() {
        return "PolyLine{" +
                "points=" + points +
                '}';
    }
    public double getLength(){
     return points.size();
    }
}
