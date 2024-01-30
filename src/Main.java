import java.util.ArrayList;

public class Main {
    private ArrayList<Person> personList = new ArrayList<>();

    public static void main(String[] args) {
        Main mainInstance = new Main();
        mainInstance.initializeData();
        mainInstance.printData();
    }

    private void initializeData() {
        Person abylay = new Person("Erzhan", "Akulov");
        abylay.setSalary(1500000);
        this.personList.add(abylay);

        Employee abylayka = new Employee("Ersin", "Kabylov", "student", 15000);
        this.personList.add(abylayka);

        Student nura = new Student("Nurakmad", "Akbergen", 2.7);
        Student akezh = new Student("Akezhan", "Bakytzhanov", 2.1);
        this.personList.add(nura);
        this.personList.add(akezh);
    }

    private void printData() {
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}

class Person {
    private String firstName;
    private String lastName;
    private double salary;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person: " + firstName + " " + lastName + ", Salary: " + salary;
    }
}

class Employee extends Person {
    private String role;

    public Employee(String firstName, String lastName, String role, double salary) {
        super(firstName, lastName);
        this.role = role;
        setSalary(salary);
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString() + ", Role: " + role;
    }
}

class Student extends Person {
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        super(firstName, lastName);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() + ", GPA: " + gpa;
    }
}
