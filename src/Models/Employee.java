package Models;

import Models.Payable;

public class Employee implements Payable {
    private int id = 0;
    private static int savedId = 0;
    private String name;
    private String surname;
    private String position;
    private int salary;

    public Employee(){

    }

    public Employee(String name, String surname, String position, int salary){
        this.savedId += 1;
        this.id = savedId;
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }

    public String toString(){
        return "Employee: " + id + ". " + name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
    public String setName(String name){
        return this.name = name;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getPosition(){
        return this.position;
    }

    public String setPosition(String position){
        return this.position = position;
    }

    public int getSalary(){
        return this.salary;

    }

    public int setSalary(int salary){
        return this.salary = salary;
    }

    @Override
    public double getPaymentAmount() {
        return this.salary;
    }
}
