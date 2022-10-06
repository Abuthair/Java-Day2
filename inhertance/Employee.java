package inhertance;

public class Employee {

    String name;
    int age;

    Employee(){
        name="Abuthair";
        age=21;
    }

    void getDetails(){
        System.out.println("This is Super Class");
        System.out.println("Name"+name);
        System.out.println("Age"+age);
    }
    
}
