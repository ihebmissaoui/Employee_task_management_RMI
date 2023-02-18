import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class EmployeeCRUDImpl extends UnicastRemoteObject implements EmployeeCRUD {
    public EmployeeCRUDImpl() throws RemoteException {
        super();
    }

    public String showEmployees() throws RemoteException {
             return "Plusieurs Employees affichés ";
    }

    public String showEmployee(String id) throws RemoteException {
        return "1 Employee affiché  ";
    }

    public String addEmployee(Employee employee) throws RemoteException {
        Employee e=new Employee();
        return " 1 Employee créé";
    }

    public String updateEmployee(String id, Employee employee) throws RemoteException {
        // TODO Auto-generated method stub
        return "& employé mise a jour";
    }

    public String deleteEmployee(String id) throws RemoteException {
        // TODO Auto-generated method stub
        return "1 employé supprimé ";
    }

  
}