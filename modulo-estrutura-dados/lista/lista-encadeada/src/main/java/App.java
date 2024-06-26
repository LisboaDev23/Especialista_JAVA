
public class App {
    public static void main(String[] args) {
        ListaEncadeada listaEncadeada = new ListaEncadeada(5);
        Node node = new Node(45);
        Node node1 = new Node(30);
        Node node2 = new Node(99);

        listaEncadeada.push(node);
        listaEncadeada.push(node1);
        listaEncadeada.push(node2);

        //listaEncadeada.printList();

        //listaEncadeada.pop();

        Node nodeInsert = new Node(10);

        listaEncadeada.insert(1, nodeInsert);

        //System.out.println(listaEncadeada.elementAt(2));
        //System.out.println(listaEncadeada.size());

        //listaEncadeada.printList();

        listaEncadeada.remove(1);
    }
}
