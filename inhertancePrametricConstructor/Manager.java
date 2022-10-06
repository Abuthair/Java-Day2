package inhertancePrametricConstructor;

public class Manager extends Employee {
    int salary;

    Manager(String name,int empId,int salary){
    super(name,empId);
    this.salary=salary;
    }

    void salary(int a){
        System.out.println("bonus" +salary*a);
    }
}
