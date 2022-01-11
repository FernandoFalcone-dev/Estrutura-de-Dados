public class EncadeamentoNo {
    public static void main(String[] args) {
        No<String> no1 = new No<>("Primeiro no"); // Os diamonds vazios subentendem o tipo que foi dado

        No<String>  no2 = new No<>("Segundo no");
        no1.setRefNo(no2);

        No<String>  no3 = new No<>("Terceiro no");
        no2.setRefNo(no3);

        No<String>  no4 = new No<>("Quarto no");
        no3.setRefNo(no4);

        //no1 -> no2 -> no3 -> no4 -> null

        System.out.println(no1);
        System.out.println(no1.getRefNo());
        System.out.println(no2.getRefNo());
        System.out.println(no3.getRefNo());
        System.out.println(no4.getRefNo());

        System.out.println("----------Similarmente poderia ser feito----------");
        System.out.println(no1);
        System.out.println(no1.getRefNo());
        System.out.println(no1.getRefNo().getRefNo());
        System.out.println(no1.getRefNo().getRefNo().getRefNo());
        System.out.println(no1.getRefNo().getRefNo().getRefNo().getRefNo());

        // Assim podemos usar da referência que um nó faz ao outro para poder acessá-los
    }
}
