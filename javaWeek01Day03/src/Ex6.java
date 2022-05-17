class MyPoint {
    private int x =0,y =0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
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

    public int[] getXY() {
        int[] xy = {x,y};
        return xy;
    }

    public void setXY(int x,int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "("+this.x + "," + this.y+")";
    }

    public double distance (int x, int y ) {
        return Math.sqrt((y-this.y)*(y-this.y)+(x-this.x) * (x-this.x));
    }

    public double distance (MyPoint another) {
        return Math.sqrt((another.y-this.y)*(another.y-this.y)+(another.x-this.x) * (another.x-this.x));
    }

    public double distance() {
        return Math.sqrt((-this.y)*(-this.y)+(-this.x) * (-this.x));
    }


}
public class Ex6 {

    public static void main(String[] args) {

        MyPoint m1  =new MyPoint(4,3);
        MyPoint m2 = new MyPoint(2,1);
        System.out.println("getX(): "+ m1.getX());
        System.out.println("getY(): "+ m1.getY());
        System.out.println("getXY(): "+ m1.getXY()[0] +","+ m1.getXY()[1]);
        m1.setXY(6,5);
        System.out.println("After-setXY(6,5)=>getXY(): "+ m1.getXY()[0] +","+ m1.getXY()[1]);
        System.out.println("distance(6,7): "+ m1.distance(6,7));
        System.out.println("distance(MyPoint m2): "+ m1.distance(m2));
        System.out.println("distance(): "+ m1.distance());
        System.out.println("toString(): "+ m1.toString());
    }
}
