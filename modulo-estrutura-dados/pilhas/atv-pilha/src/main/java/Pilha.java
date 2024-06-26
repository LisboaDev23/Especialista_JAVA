import java.util.Arrays;

public class Pilha {
    //definindo array primitivo dando um limite de 5 itens na pilha
    private  Integer[] pilha = new Integer[5];
    public void push(Integer number){
        int position = 0;
        for (Integer p : pilha) {
            if (p != null) {
                position++;
            }
        }
        pilha[position] = number;
        System.out.println("Elemento adicionado na pilha = " + number);
        System.out.println(Arrays.toString(this.pilha));
    }
    public void pop(){
        int ultimoIndice = 4;
        for (Integer p : pilha){
            if (p == null){
                ultimoIndice--;
            }
        }
        if (ultimoIndice < 0){
            System.out.println("Não é possível excluir um elemento da pilha pois está vazia!");
        }
        else {
            int numeroExcluido = pilha[ultimoIndice];
            System.out.println("Número excluído = " + numeroExcluido);
            pilha[ultimoIndice] = null;
            System.out.println(Arrays.toString(pilha));
        }
    }
    public void top(){
        int ultimaPosicao = 4;
        for (Integer p : pilha){
            if (p == null){
                ultimaPosicao--;
            }
        }
        if (ultimaPosicao<0){
            System.out.println("Não possui nenhum elemento na pilha!");
        } else {
            System.out.println("O elemento que está no topo da pilha é " + pilha[ultimaPosicao]);
        }
    }
    public Integer size(){
        int tamanhoPilha = pilha.length;
        for (Integer p : pilha){
            if (p == null){
                tamanhoPilha--;
            }
        }
        return tamanhoPilha;
    }
    public boolean isEmpty(){
        for (Integer p : pilha){
            if (p != null){
                return false;
            }
        }
        return true;
    }
}
