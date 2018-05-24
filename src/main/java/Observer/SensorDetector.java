package Observer;

import java.util.ArrayList;

public class SensorDetector implements IObservable {

    private ArrayList<IObserver> observers = new ArrayList<>();

    @Override
    public void AddObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void DetectMovement() {
        for (IObserver o : observers)
            o.Notify();
    }
}
