import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import models.Employee;

public class EmployeeCRUDImpl extends UnicastRemoteObject implements EmployeeCRUD {
    public EmployeeCRUDImpl() throws RemoteException {
        super();
    }

    @Override
    public String showEmployees() throws RemoteException {
             return "Plusieurs Employees affichés ";
    }

    @Override
    public String showEmployee(String id) throws RemoteException {
        return "1 Employee affiché  ";
    }

    @Override
    public String addEmployee(Employee employee) throws RemoteException {
        // TODO Auto-generated method stub
        return " 1 Employee créé";
    }

    @Override
    public String updateEmployee(String id, Employee employee) throws RemoteException {
        // TODO Auto-generated method stub
        return "& employé mise a jour";
    }

    @Override
    public String deleteEmployee(String id) throws RemoteException {
        // TODO Auto-generated method stub
        return "1 employé supprimé ";
    }

  
}