package inhertance;

public class Manager extends Employee{
    int salary;
    Manager(){
        // super();
        name="Sheika";
        age=18;
        salary=200;
    }
    void getSalary(int a){
     System.out.println("salary "+salary*a);
    }
}
