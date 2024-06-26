import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Collections;

public class ListaEncadeada {

    private Node[] nos;
    private int cabeca;
    private int calda;
    private int tamanho;
    private int capacidade;

    public ListaEncadeada(int capacidade){
        this.capacidade = capacidade;
        this.nos = new Node[capacidade];
        this.cabeca= -1;
        this.calda= -1;
        this.tamanho = 0;
    }
    public void push(Node node){
        if (tamanho == capacidade){
            throw new IllegalStateException("Lista encadeada cheia!");
        }
        nos[tamanho] = node;
        if (cabeca == -1){
            cabeca = tamanho;
        } else{
            nos[calda].setPonteiroProximo(tamanho);
        }
        calda = tamanho;
        tamanho++;
    }

    public void pop(){
        System.out.println("Elemento que foi retirado da lista encadeada foi " + nos[nos.length-1]);
        nos[nos.length-1] = null;
    }

    public Node elementAt(int index){
       return nos[index];
    }

    public int size(){
        int tamanhoLista = nos.length;
        for (Node n : nos){
            if (n == null){
                tamanhoLista--;
            }
        }
        return tamanhoLista;
    }

    public void printList(){
        int current = cabeca;
        while (current != -1){
            System.out.println(nos[current].getValue() + " -> ");
            current = nos[current].getPonteiroProximo();
        }
        System.out.println("null");
    }

    public void insert(int index, Node node){
        if (index == 0){
            cabeca = node.getValue();
        } else if (index == capacidade-1) {
            calda = node.getValue();
        }
        nos[index] = node;
        nos[index].setPonteiroProximo(index+1);
        nos[index-1].setPonteiroProximo(index);
        System.out.println(node + " foi inserido na lista encadeada na posição " + index);
    }

    public void remove(int index){
        nos[index] = nos[index+1];
        nos[index+1] = null;
        System.out.println(Arrays.toString(nos));
    }
}
