public class App {
    public static void main(String[] args) {
        // No<String> no1 = new No<>("Primeiro no"); // Os diamonds vazios subentendem o tipo que foi dado

        // No<String>  no2 = new No<>("Segundo no");
        // no1.setProximoNo(no2);

        // No<String>  no3 = new No<>("Terceiro no");
        // no2.setProximoNo(no3);

        // No<String>  no4 = new No<>("Quarto no");
        // no3.setProximoNo(no4);

        // //no1 -> no2 -> no3 -> no4 -> null

        // System.out.println(no1);
        // System.out.println(no1.getProximoNo());
        // System.out.println(no2.getProximoNo());
        // System.out.println(no3.getProximoNo());
        // System.out.println(no4.getProximoNo());

        // System.out.println("----------Similarmente poderia ser feito----------");
        // System.out.println(no1);
        // System.out.println(no1.getProximoNo());
        // System.out.println(no1.getProximoNo().getProximoNo());
        // System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        // System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

        // // Assim podemos usar da referência que um nó faz ao outro para poder acessá-los

        No<Integer> no5 = new No<>(10);
        No<Integer> no6 = no5;

        System.out.println(no5 + " - " + no6);
    }
}
