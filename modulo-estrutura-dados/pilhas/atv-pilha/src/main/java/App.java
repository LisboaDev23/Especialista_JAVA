public class App {
    public static void main(String[] args) {
        //instancinado uma nova pilha
        Pilha pilha = new Pilha();

        //adicionando elementos na pilha
        pilha.push(10);
        pilha.push(5);
        pilha.push(8);
        pilha.push(1);
        pilha.push(4);

        //removendo o último elementos e retornando no print o número que foi excluído
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.push(4);
        pilha.push(4);
        pilha.push(8);
        //espiando o elemento no topo da pilha
        pilha.top();

        //saber a quantidade de elementos na pilha
        System.out.println(pilha.size());

        //saber se o array está vazio ou não!
        System.out.println(pilha.isEmpty());


    }
}
