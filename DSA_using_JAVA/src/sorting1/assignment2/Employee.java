package sorting1.assignment2;

public class Employee {
    private int id;
    private double sal;
    private String name;

    public Employee(){

    }
    public Employee(int id, String name, double sal){
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public boolean isGreterSal(Employee e){
        return this.sal>e.sal;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", sal=" + sal +
                ", name='" + name + '\'' +
                '}';
    }
}
