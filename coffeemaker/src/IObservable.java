public interface IObservable {
    public void attach(IObserver observer);

    public void notifyAllObservers();

}
