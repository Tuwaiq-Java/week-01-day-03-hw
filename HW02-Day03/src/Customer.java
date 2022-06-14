//Answer 4
public class Customer {
    private int ID;
    private String name;
    private char gender;

    public Customer(int ID, String name, char gender) throws Exception{
        this.ID = ID;
        this.name = name;
        if(Character.toLowerCase(gender) == 'm' || Character.toLowerCase(gender) =='f')
        {this.gender = gender;}
        else
            throw new Exception();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) throws Exception {
        if(Character.toLowerCase(gender) == 'm' || Character.toLowerCase(gender) =='f'){
            this.gender = gender;}
        throw new Exception();
    }

    @Override
    public String toString() {
        return name+"("+ID+")";
    }
}
