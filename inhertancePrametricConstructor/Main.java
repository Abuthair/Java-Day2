package inhertancePrametricConstructor;

import OPPS_Polymorphism_ConstructorOverloading.main;

public class Main {

    public static void main(String[] args) {
        
        Employee emp= new Employee("Abuthair", 2);
        emp.getDetails();
        Manager man = new Manager("Sheik", 4, 2000);
        man.getDetails();
        man.salary(2);
    }
}
