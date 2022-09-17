public class CustomerManager {

    private Logger[] loggers;

    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    public void add(Customer customer){
        System.out.println("Müşteri Eklendi: " + customer.getFirstName() + " " + customer.getLastName());
        for (Logger logger: loggers){
            logger.log(customer.getFirstName() + " " + customer.getLastName());
        }
    }

    public void delete(Customer customer){
        System.out.println("Müşteri Silindi: " + customer.getFirstName() + " " + customer.getLastName());
        for (Logger logger: loggers){
            logger.log(customer.getFirstName() + " " + customer.getLastName());
        }
    }

}
