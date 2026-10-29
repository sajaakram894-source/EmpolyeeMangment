package jobwithinterface;
public class Jobwithinterface {
   public static void main(String[] args) {
 Employee e1 = new FullTime("Ahmed", 3000);
    Employee e2 = new PartTime("Sara", 1500);
    Employee e3 = new Manager("Ali", 5000);

    e1.display();
    e1.doWork();

    e2.display();
    e2.doWork();

    e3.display();
    e3.doWork();
}    }

