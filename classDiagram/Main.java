package classDiagram;

public class Main {
    public static void main(String[] args) {
//        Question3
        customer custom = new customer(16, "Lina Aloqaily", 'F');
        int id = custom.getId();
        String name = custom.getName();
        char gender = custom.getGender();
        System.out.println(custom.toString());

//        Question4
        circle circ = new circle(2.8);
        double radius = circ.getRadius();
        circ.setRadius(0.5);
        double Area = circ.getArea();
        double Circumference = circ.getCircumference();
        System.out.println(circ.toString());

//        Question5
        polyLine pl = new polyLine();
        polyLine pl1 = new polyLine();
        System.out.println(pl.toString());

    }
}
