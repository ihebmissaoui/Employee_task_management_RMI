import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {

            EmployeeCRUDImpl empCRUD = new EmployeeCRUDImpl();
            System.setProperty("java.rmi.server.hostname","localhost");
        Registry rgsty = LocateRegistry.createRegistry(1099);
        Object lockObject =new Object();
         /* */   rgsty.rebind("localhost/empCRUD", empCRUD);
            /*
             * TaskCRUD taskCRUD = new TaskCRUDImpl();
             * 
             * Naming.rebind("localhost/taskCRUD", empCRUD);
             */
            synchronized(lockObject)
            {
                    lockObject.wait();
            }
            System.out.println("Server Ready");
            System.out.println("Salut");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}