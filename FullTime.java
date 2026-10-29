package jobwithinterface;
class FullTime extends Employee {
public FullTime(String name, double salary) {
    super(name, salary);
}

@Override
public void doWork() {
    System.out.println(name + " works full time");
}
}