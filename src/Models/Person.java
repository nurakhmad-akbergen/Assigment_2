package Models;

import Models.Payable;

public class Person implements Payable {

    private static int savedId = 0;
    private int id = 0;
    private String name;
    private String surname;
    private String position;

    private double salary;


    public Person(){

    }
    public Person(String name, String surname){
        this.savedId += 1;
        id += savedId;
        this.name = name;
        this.surname = surname;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String setName(String name){
        this.name = name;
        return this.name;
    }


    public String getSurname(){
        return this.surname;
    }

    public String setSurname(String surname){
        return this.surname = surname;
    }

    public String getPosiion(){
        if(this.position != null){
            return this.position;
        }else{
            return "Student";
        }
    }



    public String toString(){
        return id + "." + " " + name + " " + surname;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    @Override
    public double getPaymentAmount() {
        return this.salary;
    }
}