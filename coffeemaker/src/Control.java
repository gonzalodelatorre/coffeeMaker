import java.util.ArrayList;
import java.util.List;

public class Control implements IObservable {


    private List<IObserver> observers = new ArrayList<IObserver>();

    @Override
    public void attach(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (IObserver observer : observers) {
            observer.update(this);
        }
    }
}
