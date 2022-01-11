package listas;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeada<String> listaEncadeada = new ListaEncadeada<>();

        listaEncadeada.add("Fernando");
        listaEncadeada.add("Gabriela");
        listaEncadeada.add("Suzana");
        listaEncadeada.add("Pedro");
        listaEncadeada.add("Fabio");

        System.out.println(listaEncadeada.get(0)); 
        System.out.println(listaEncadeada.get(2)); 

        System.out.println(listaEncadeada);

        System.out.println(listaEncadeada.remove(3));
        System.out.println(listaEncadeada);
    }
}
