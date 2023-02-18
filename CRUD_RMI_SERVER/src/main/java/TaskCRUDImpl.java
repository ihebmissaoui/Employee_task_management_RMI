import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class TaskCRUDImpl extends UnicastRemoteObject implements TaskCRUD {
    public TaskCRUDImpl() throws RemoteException {
        super();
    }

    public String showEmployees() throws RemoteException {
        // TODO Auto-generated method stub
        return null;
    }

    public String showEmployee(String id) throws RemoteException {
        // TODO Auto-generated method stub
        return null;
    }

    public String addEmployee(Employee employee) throws RemoteException {
        // TODO Auto-generated method stub
        return null;
    }

    public String updateEmployee(String id, Employee employee) throws RemoteException {
        // TODO Auto-generated method stub
        return null;
    }

    public String deleteEmployee(String id) throws RemoteException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String showTasks() throws RemoteException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String showTask(String id) throws RemoteException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String addTask(Task task) throws RemoteException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String updateTask(String id, Task task) throws RemoteException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String deleteTask(String id) throws RemoteException {
        // TODO Auto-generated method stub
        return null;
    }

   
    

  
}