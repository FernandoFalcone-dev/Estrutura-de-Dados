package pilha;

public class PilhaTeste {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        pilha.push(1);
        pilha.push(5);
        pilha.push(17);
        pilha.push(3);
        pilha.push(35);
        System.out.println(pilha);

        System.out.println(pilha.peek());

        pilha.pop();
        System.out.println(pilha);

        System.out.println("A pilha está vazia? " + pilha.isEmpty());
    }
}
