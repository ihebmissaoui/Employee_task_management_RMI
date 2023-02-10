import java.rmi.Remote;
import java.rmi.RemoteException;

import models.Task;

public interface TaskCRUD extends Remote {
    public String showTasks() throws RemoteException;
    public String showTask(String id) throws RemoteException;
    public String addTask(Task task) throws RemoteException;
    public String updateTask(String id,Task task) throws RemoteException;
    public String deleteTask(String id) throws RemoteException;



}