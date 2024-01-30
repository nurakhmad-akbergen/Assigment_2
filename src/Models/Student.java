package Models;

public class Student implements Payable{
    private int id = 0;
    private static int savedId = 0;
    private String name;
    private String surname;
    private double gpa;

    private double salary;
    public Student(){

    }
    public Student(String name, String surname, double gpa){
        this.savedId += 1;
        this.id = savedId;
        this.name  = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String toString() {
        return "Student" + ":" + " " + id + "." + name + " GPA: " + gpa;
    }

    @Override
    public double getPaymentAmount() {
        if(this.gpa > 2.67){
            this.salary += 36660;
        }
        return this.salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public double getGPA(){
        return this.gpa;
    }
    public void setGPA(double gpa){
        this.gpa = gpa;
    }
}