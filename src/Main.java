import Models.Employee;
import Models.Person;
import Models.Student;

import java.util.ArrayList;


public class Main {
    private ArrayList<Person> personList = new ArrayList<>();

    private ArrayList<Employee> employeeList = new ArrayList<>();
    private ArrayList<Student> studentList = new ArrayList<>();
    // I created 3 arraylists, because we have 3 types of peoples: employee, person and student.
    // So, we can`t add 3 types of people to one ArrayList. It`s may be really, I tried with abstract class, but I can`t do it
    public static void main(String[] args) {
        Main mainInstance = new Main();
        mainInstance.InitializeData();

        mainInstance.printData();

    }

    private void InitializeData(){

        Person abylay = new Person("Erzhan", "Akulov");
        abylay.setSalary(1500000);


        Employee abylayka = new Employee("Ersin", "Kabylov", "student", 15000);


        Student Nura = new Student("Nurakmad", "Akbergen", 2.7);
        Student Akezh = new Student("Akezhan", "Bakytzhanov", 2.1);

        this.personList.add(abylay);

        this.employeeList.add(abylayka);
        this.studentList.add(Nura);
        this.studentList.add(Akezh);


    }

    public void printData(){
        for(Person person : personList){
            System.out.println("Person:" + person.getId() + ". " + person.getName() + person.getSurname() + " зарабатывает " + person.getPaymentAmount());
        }

        for(Student student : studentList){
            System.out.println("Student:" + student.getId() + ". " + student.getName() + student.getSurname() + " зарабатывает " + student.getPaymentAmount());
        }

        for(Employee employee : employeeList){
            System.out.println("Employee:" + employee.getId() + ". " + employee.getName() + employee.getSurname() + " зарабатывает " + employee.getPaymentAmount());
        }
    }
}