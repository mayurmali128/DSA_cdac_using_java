package queueusingarray.assignment2;

public class Customer {
    private int id;
    private String name;
    private double amount;

    public Customer(){

    }
    public Customer(int id, String name, double amount){
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
