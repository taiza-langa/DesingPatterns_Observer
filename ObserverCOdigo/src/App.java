public class App {
    public static void main(String[] args) {
        Subject subject = new Subject();

        // Criando observadores
        ConcreteObserver observer1 = new ConcreteObserver("Observador 1");
        ConcreteObserver observer2 = new ConcreteObserver("Observador 2");

        // Adicionando os observadores
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        // Notificando todos os observadores
        subject.notifyObservers("Olá, Observadores!");
    }
}