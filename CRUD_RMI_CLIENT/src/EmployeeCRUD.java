import java.rmi.Remote;
import java.rmi.RemoteException;

import models.Employee;


public interface EmployeeCRUD extends Remote {
    public String showEmployees() throws RemoteException;
    public String showEmployee(String id) throws RemoteException;
    public String addEmployee(Employee employee) throws RemoteException;
    public String updateEmployee(String id,Employee employee) throws RemoteException;
    public String deleteEmployee(String id) throws RemoteException;



}