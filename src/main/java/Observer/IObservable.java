package Observer;

public interface IObservable {
    public void AddObserver(IObserver o);
    public void DetectMovement();
}
