public class Main {
    public static void main(String[] args) {

        // customer
        customer custom = new customer(7, "Faisal Saud", 'M');
        int id = custom.getId();
        String name = custom.getName();
        char gender = custom.getGender();
        System.out.println(custom.toString());

/////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////

        // circle
        circle circ = new circle(3.4);
        double radius = circ.getRadius();
        circ.setRadius(0.8);

        double Area = circ.getArea();
        double Circumference = circ.getCircumference();
        System.out.println(circ.toString());


        // polyLine
        polyLine pl = new polyLine();
        polyLine pl1 = new polyLine();
        System.out.println(pl.toString());

    }}
