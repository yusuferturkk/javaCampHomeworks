import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new SmsLogger()};

        CustomerManager customerManager = new CustomerManager(loggers);

        Customer customer1 = new Customer(1, "Yusuf", "Ertürk");
        Customer customer2 = new Customer(2, "Emre", "Sayar");

        customerManager.add(customer1);
        //customerManager.delete(customer2);
    }
}