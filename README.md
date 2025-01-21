<h2>Desing Patterns - Observer</h2>

Esse código implementa o padrão de projeto Observer, no qual um objeto (o Subject) mantém uma lista de observadores que serão notificados automaticamente sempre que houver uma atualização. Os observadores implementam a interface Observer e definem o comportamento ao receberem uma notificação. No exemplo, dois observadores (ConcreteObserver) são registrados no Subject e, ao chamar notifyObservers, ambos recebem uma mensagem e a exibem no console. Esse padrão é útil para criar sistemas reativos e desacoplados.
