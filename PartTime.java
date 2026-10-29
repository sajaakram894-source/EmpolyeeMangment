package jobwithinterface;
class PartTime extends Employee {
public PartTime(String name, double salary) {
    super(name, salary);
}

@Override
public void doWork() {
    System.out.println(name + " works part time");
}
}