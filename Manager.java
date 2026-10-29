package jobwithinterface;
class Manager extends Employee {
public Manager(String name, double salary) {
    super(name, salary);
}

@Override
public void doWork() {
    System.out.println(name + " manages the company");
}
}