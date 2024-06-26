import java.util.Arrays;

public class Fila {

    private Integer fila[];
    private int capacidade;
    private int inicioFila;

    private int posicaoFila;
    private int fimFila;
    private int qtdItensFila;

    public Fila(int capacidade){
        this.fila = new Integer[capacidade];
        this.capacidade = capacidade;
        this.inicioFila = 0;
        this.posicaoFila = 0;
        this.fimFila = 0;
        this.qtdItensFila = 0;
    }
    public void enqueue(Integer numero){
        if (qtdItensFila == capacidade){
            System.out.println("Fila cheia!");
        }
        fila[posicaoFila] = numero;
        posicaoFila++;
        qtdItensFila++;
        fimFila++;
        System.out.println(numero + " adicionado a fila!");
        System.out.println(Arrays.toString(fila));
    }

    public void dequeue(){
        if (qtdItensFila == 0){
            System.out.println("Não foi possível excluir nenhum elemento da fila pois a fila está vazia!");
        }
        System.out.println("O element removido foi o " + fila[inicioFila]);
        fila[inicioFila] = null;
        inicioFila = (inicioFila+1) % capacidade;
        posicaoFila--;
        qtdItensFila--;
        fimFila--;
        System.out.println(Arrays.toString(fila));
    }

    public Integer rear(){
        return fila[fimFila];
    }

    public Integer front(){
        if (qtdItensFila == 0){
            System.out.println("Fila vazia!");
        }
        System.out.println("Número no início da fila é " + fila[inicioFila]);
        return fila[inicioFila];
    }

    public Integer size(){
        System.out.println(qtdItensFila + " itens na fila.");
        return qtdItensFila;
    }

    public boolean isEmpty(){
        System.out.println(qtdItensFila == 0);
        return qtdItensFila == 0;
    }
}
