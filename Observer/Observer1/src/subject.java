package Uygulama1;

public interface subject {

    void register(Observer observer);
    void deregister(Observer observer);
    void notifyObservers();
}
