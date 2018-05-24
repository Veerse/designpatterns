package Observer;

public class Doors implements IObserver {
    @Override
    public void Notify() {
        System.out.println("Doors are closed!");
    }
}
