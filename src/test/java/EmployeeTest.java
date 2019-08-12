import static org.junit.Assert.*;


public class EmployeeTest {
    public static void main (String args[]) {
        Employee emp = new Employee(30,"Padamja");
        System.out.println(emp.age);
        System.out.println(emp.name);
    }

}