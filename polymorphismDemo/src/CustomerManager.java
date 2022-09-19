public class CustomerManager {
    private  BaseLogger baseLogger;

    public CustomerManager(BaseLogger logger){
        baseLogger = logger;
    }

    public void add(){
        System.out.println("Müşteri eklendi");
    }
}
