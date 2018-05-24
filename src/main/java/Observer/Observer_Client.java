package Observer;

public class Observer_Client {
    public static void main(String[] args) {
        IObservable sensor = new SensorDetector();

        IObserver alarm = new Alarm();
        IObserver doors = new Doors();

        sensor.AddObserver(alarm);
        sensor.AddObserver(doors);

        sensor.DetectMovement();
    }
}
