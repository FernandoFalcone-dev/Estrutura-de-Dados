

public class Pilha<T> {
    private No<T> refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(T object) {
        No<T> novoNo = new No<>(object);
        No<T> refAuxiliar = refNoEntradaPilha; // guarda a referência do nó anterior
        refNoEntradaPilha = novoNo; // recebe o novo nó
        refNoEntradaPilha.setRefNo(refAuxiliar); // faz referência ao nó de baixo
    }

    public No<T> pop(){
        if (!this.isEmpty()) {
            No<T> noRetirado = refNoEntradaPilha; // guarda a referência do nó retirado
            refNoEntradaPilha = refNoEntradaPilha.getRefNo(); // recebe a referência do nó de baixo
            return noRetirado; // retorna o nó retirado
        }
        return null;
    }

    public No<T> peek(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {

        return refNoEntradaPilha == null ? true : false;
    }


    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "      Pilha\n";
        stringRetorno += "------------\n";

        No<T> noAuxiliar = refNoEntradaPilha;
        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } 
            else break;
        }
        return stringRetorno;
    }

}
