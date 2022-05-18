
import java.awt.*;
import java.util.ArrayList;
public class polyLine {
    private ArrayList<Point>points;
    private int x;
    private int y;

    public polyLine(){
        this.points = new ArrayList<Point>();
    }

    public polyLine(ArrayList<Point>points){
        this.points = points;
    }
    public void appendPoint(int x,  int y){
        this.appendPoint(x, y);
    }

    public void appendPoint(ArrayList<Point>point){
        this.appendPoint(x,y);
    }

    public String toString(){
        return "{(" + x + "1,"+ y + "1)(" + x + "2," + y + "2)("+ x + "3,"+ y +"3)...}" ;
    }
}