package Models;

public class Person implements Payable {

    private static int savedId = 0;
    private int id;
    private String name;
    private String surname;
    private String position;
    private double salary;

    public Person() {
        savedId++;
        id = savedId;
    }

    public Person(String name, String surname) {
        savedId++;
        id = savedId;
        this.name = name;
        this.surname = surname;
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
        return (position != null) ? position : "Student";
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
}