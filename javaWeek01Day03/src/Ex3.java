public class Ex3 {

    public static class Ball {
        private float x,y;
        private int radius;
        private float xDelta, yDelta;

        public Ball(float x, float y, int radius, float xDelta, float yDelta) {
            this.x = x;
            this.y = y;
            this.radius = radius;
            this.xDelta = xDelta;
            this.yDelta = yDelta;
        }

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public float getxDelta() {
            return xDelta;
        }

        public void setxDelta(float xDelta) {
            this.xDelta = xDelta;
        }

        public float getyDelta() {
            return yDelta;
        }

        public void setyDelta(float yDelta) {
            this.yDelta = yDelta;
        }

        public void move() {
            x += xDelta;
            y += yDelta;
        }

        public void reflectHorizontal(){
            xDelta = xDelta -1;
        }

        public void reflectVertical(){
            yDelta = yDelta -1;
        }

        @Override
        public String toString() {
            return "Ball[(" + x +
                    "," + y +
                    "),speed=(" + xDelta + "," + yDelta + ")]";
        }
    }

    public static void main(String[] args) {

        Ball b1 = new Ball(1,2,3,1,2);
        b1.move();
        b1.move();
        b1.move();
        System.out.println(b1.toString());
    }
}
