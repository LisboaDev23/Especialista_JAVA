public class Node {

    private int ponteiroProximo;

    private int value;

    public Node(Integer value) {
        this.value = value;
        this.ponteiroProximo = -1;
        //tive que colocar -1 porque sempre que eu colocava null, o JAVA lançava um NullPointer exception, logo tive que representar null dessa forma -1.
    }

    public int getPonteiroProximo() {
        return ponteiroProximo;
    }

    public void setPonteiroProximo(int ponteiroProximo) {
        this.ponteiroProximo = ponteiroProximo;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", ponteiroProximo=" + ponteiroProximo +
                '}';
    }
}
