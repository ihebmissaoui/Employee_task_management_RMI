import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            EmployeeCRUD obj = (EmployeeCRUD) Naming.lookup("localhost/EmployeeCRUD");
            System.out.println(obj.addEmployee(null));
            System.out.println(obj.showEmployee(null));
            System.out.println(obj.showEmployees());


        } catch (Exception e) {
            System.out.println("Client Error: " + e);
        }
    }
}