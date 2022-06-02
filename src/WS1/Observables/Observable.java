package WS1.Observables;

import WS1.Observers.Observer;

import java.util.ArrayList;

public class Observable<T> {
    ArrayList<Observer<T>>  itsObservers = new  ArrayList<>();


    public  void addObserver(Observer<T> observer){
        itsObservers.add(observer);
    }
    public  void removeObserver(Observer<T> observer){
        itsObservers.remove(observer);
    }

    public <T>void notifyObservers(T data) {
        for (Observer observer : itsObservers) {
            observer.update(data);
        }
    }

}
