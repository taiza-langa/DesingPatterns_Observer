//  Implementa a interface Observer e define o comportamento do observador quando ele recebe uma notificação, imprimindo a mensagem recebida.

class ConcreteObserver implements Observer {
    private String name;

    // Construtor da Classe
    public ConcreteObserver(String name) {
        this.name = name;
    }

    // Configuração quando o observer recebe uma notificação (update).
    @Override
    public void update(String message) {
        System.out.println(name + " recebeu a mensagem: " + message);
    }
}