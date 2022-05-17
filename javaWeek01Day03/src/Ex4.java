class Employee {
    private int id, salary;
    private String firstName, lastName;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        this.salary += (salary/ percent);
        return this.salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName () {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", name=" + this.getFirstName() + " " + this.getLastName() +", salary= "+this.getSalary() +
                ']';
    }
}
public class Ex4 {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Salah", "Alsalman",3000);
        System.out.println("getId(): "+emp1.getId());
        System.out.println("getSalary(): "+emp1.getSalary());
        emp1.setSalary(4000);
        System.out.println("getSalary(): "+emp1.getSalary());
        System.out.println("getAnnualSalary(): "+emp1.getAnnualSalary());
        emp1.raiseSalary(10);
        System.out.println("getSalaryAfterRaise(): "+emp1.getSalary());
        System.out.println("getAnnualSalaryAfterRaise(): "+emp1.getAnnualSalary());


    }
}
