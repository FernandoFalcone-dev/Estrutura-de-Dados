package listaduplamenteencadeada;

import no.NoDuplo;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;


    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public int size() {
        return this.tamanhoLista;
    }

    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoPosterior(null);
        novoNo.setNoAnterior(ultimoNo);

        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }
        if (ultimoNo != null) {
            ultimoNo.setNoPosterior(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento) {
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoPosterior(noAuxiliar);

        if (novoNo.getNoPosterior() != null) {
            novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
            novoNo.getNoPosterior().setNoAnterior(novoNo);
        } else {
            novoNo.setNoAnterior(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getNoAnterior().setNoPosterior(novoNo);
        }
        this.tamanhoLista++;
    }
    
    public void remove(int index) {

        if (index == 0) {
            primeiroNo = primeiroNo.getNoPosterior();
            if (primeiroNo != null) {
                primeiroNo.setNoAnterior(null);
            }
        } else {
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoAnterior().setNoPosterior(noAuxiliar.getNoPosterior()); 
            // retira o nó do meio de dois nós, fazendo o anterior ao nó removido apontar para o nó posterior
            if (noAuxiliar != ultimoNo) {
                noAuxiliar.getNoPosterior().setNoAnterior(noAuxiliar.getNoAnterior());
                // retira o nó do meio de dois nós, fazendo o posterior ao nó removido aponta para o nó anterior
            } else {
                ultimoNo = noAuxiliar;
            }
        }
        this.tamanhoLista--;
    }
    
    public T get(int index) {
        return this.getNo(index).getDado();
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo; // poderia começar pelo último e fazer o caminho inverso
        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoPosterior();
        }
    
        return noAuxiliar;
    }


    @Override
    public String toString() {
       String strRetorno = "";

       NoDuplo<T> noAuxiliar = primeiroNo;
       for (int i = 0; i < this.size(); i++) {
           strRetorno += "[No{dado = " + noAuxiliar.getDado() + "}]--->";
           noAuxiliar = noAuxiliar.getNoPosterior();
       }
       strRetorno += "null";

       return strRetorno;
    }

}
