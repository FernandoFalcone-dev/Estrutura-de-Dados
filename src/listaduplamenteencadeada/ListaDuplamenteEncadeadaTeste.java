package listaduplamenteencadeada;

public class ListaDuplamenteEncadeadaTeste {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> listaNomes = new ListaDuplamenteEncadeada<>();

        listaNomes.add("Fernando");
        listaNomes.add("Lucas");
        listaNomes.add("Alana");
        listaNomes.add("Davi");
        listaNomes.add("José");
        System.out.println(listaNomes);
        System.out.println("O tamanho da lista é: " + listaNomes.size() + "\n");
        
        listaNomes.add("Marina"); // insere no fim da lista
        System.out.println(listaNomes + "\n");
        listaNomes.remove(5);
        System.out.println(listaNomes + "\n");

        listaNomes.add(0, "Marina"); // sobrecarga do método add
        System.out.println(listaNomes + "\n");
        listaNomes.remove(0);
        System.out.println(listaNomes.get(0));


    }
}
