package Observer;

public class Alarm implements IObserver {

    @Override
    public void Notify() {
        System.out.println("Alarm is ringing");
    }
}
