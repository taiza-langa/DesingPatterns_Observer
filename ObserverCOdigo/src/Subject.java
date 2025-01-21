// Mantém uma lista de observadores, permitindo adicionar observadores com o método addObserver e notificando todos eles com o método notifyObservers.

import java.util.ArrayList;
import java.util.List;

class Subject {

    // Lista para armazenar todos os observers
    private List<Observer> observers = new ArrayList<>();

    // Método para adicionar observadores
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Método para notificar todos os observadores
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}