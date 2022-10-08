public abstract class BaseCreditManager implements ICreditManager{
    public abstract void calculate();

    public final void save(){
        System.out.println("Kaydedildi");
    }
}
