package listacircular;

public class ListaCircularTeste {
    public static void main(String[] args) {
        ListaCircular<String> diasSemana = new ListaCircular<>();

        diasSemana.add("Domingo");
        System.out.println(diasSemana);
        diasSemana.remove(0);
        System.out.println(diasSemana); 
        
        diasSemana.add("Domingo");
        diasSemana.add("Sábado");
        diasSemana.add("Sexta-feira");
        diasSemana.add("Quinta-feira");
        diasSemana.add("Quarta-feira");
        diasSemana.add("Terça-feira");
        diasSemana.add("Segunda-feira");
        System.out.println(diasSemana);

        for (int i = 0; i < 14; i++) {
            System.out.println(diasSemana.get(i)); // demonstra que sempre percorrerá em circulos
        }
    }
}
