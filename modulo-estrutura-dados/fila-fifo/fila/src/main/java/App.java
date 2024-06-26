

public class App {
    public static void main(String[] args) {
        Fila fila = new Fila(4);
        fila.enqueue(10);
        fila.enqueue(5);
        fila.enqueue(1);
        fila.enqueue(9);
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        fila.enqueue(9);
        fila.enqueue(7);
        fila.enqueue(55);
        fila.front();
        fila.size();
        fila.rear();
        fila.isEmpty();
    }
}
