import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import models.Employee;

public class TaskCRUDImpl extends UnicastRemoteObject implements EmployeeCRUD {
    public TaskCRUDImpl() throws RemoteException {
        super();
    }

    @Override
    public String showEmployees() throws RemoteException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String showEmployee(String id) throws RemoteException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String addEmployee(Employee employee) throws RemoteException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String updateEmployee(String id, Employee employee) throws RemoteException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String deleteEmployee(String id) throws RemoteException {
        // TODO Auto-generated method stub
        return null;
    }

   
    

  
}