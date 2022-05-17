package classDiagram;

public class customer {
    private int ID;
    private String name;
    private char gender;

    public customer(int id, String name, char gender) {
        ID = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString(){
        return ""+ name + "(" + ID + ")";
    }
}
