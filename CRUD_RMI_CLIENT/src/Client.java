import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            Hello obj = (Hello) Naming.lookup("localhost/Hello");
            System.out.println(obj.sayHello());
        } catch (Exception e) {
            System.out.println("Client Error: " + e);
        }
    }
}