package fila;

public class FilaTeste {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<>();

        fila.enqueue("Gol");
        fila.enqueue("HB20");
        fila.enqueue("Onix");
        fila.enqueue("Mobi");
        fila.enqueue("Kwid");
        System.out.println(fila);

        System.out.println(fila.dequeue());
        System.out.println(fila);

        System.out.println(fila.first());

        System.out.println("A fila está vazia? " + fila.isEmpty());

    }
}
