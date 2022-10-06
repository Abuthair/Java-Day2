package inhertance;

public class InhertanceDemo {
    public static void main(String[] args) {
        
        Employee emp = new Employee();
        emp.getDetails();
        Manager man = new Manager();
        man.getDetails();
        man.getSalary(2);
    }
}
