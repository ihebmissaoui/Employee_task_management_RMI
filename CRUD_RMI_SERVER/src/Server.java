import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            
            LocateRegistry.createRegistry(1099);//Because with running with default port i think it's used
            EmployeeCRUD empCRUD = new EmployeeCRUDImpl();
            Naming.rebind("localhost/EmployeeCRUD", empCRUD);
            System.out.println("Server Ready");
        } catch (Exception e) {
            System.out.println("Server Error: " + e);
        }
    }
}