package Models;

public class Employee implements Payable {
    private static int savedId = 0;
    private int id;
    private String name;
    private String surname;
    private String position;
    private int salary;

    public Employee() {
        savedId++;
        this.id = savedId;
    }

    public Employee(String name, String surname, String position, int salary) {
        savedId++;
        this.id = savedId;
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + id + ". " + name + " " + surname + ", Position: " + position + ", Salary: " + salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
}

