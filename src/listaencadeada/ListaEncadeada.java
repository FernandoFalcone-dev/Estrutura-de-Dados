package listaencadeada;

import no.No;

public class ListaEncadeada<T> {
    private No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public void add(T dado) {
        No<T> novoNo = new No<>(dado);
        if (this.isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index) {
        return getNo(index).getDado();
    }

    private No<T> getNo(int index) {
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(int index) {
        No<T> noPivor = this.getNo(index);
        if (index == 0) {
            referenciaEntrada = noPivor.getProximoNo(); // para o que está a frente do noPivor
            return noPivor.getDado(); // remove da lista
        }

        No<T> noAnterior = getNo(index - 1); // seleciona o no anterior ao noPivor
        noAnterior.setProximoNo(noPivor.getProximoNo()); // aponta este para o que está a frente do noPivor
        return noPivor.getDado(); // remove da lista
    }

    public boolean isEmpty() {
        return referenciaEntrada == null ? true : false;
    }

    public int size() {
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while (true) {
            if (referenciaAux != null) {
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null) {
                    referenciaAux = referenciaAux.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    private void validaIndice(int index) {
        if (index >= size()) {
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("O índice " + index + "é maior que o último índice da lista de valor " + ultimoIndice);
        }
    }


    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No{dado = " + noAuxiliar.getDado() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }

}
