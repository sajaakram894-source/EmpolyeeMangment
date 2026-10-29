package jobwithinterface;
public class Employee implements Work { String name; double salary;
public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
}

@Override
public void doWork() {
    System.out.println(name + " is working");
}

void display() {
    System.out.println("Name: " + name);
    System.out.println("Salary: " + salary);
}
}