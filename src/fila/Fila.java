package fila;

import no.No;

public class Fila<T> {
    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(T object) {
        No<T> novoNo = new No<>(object);
        novoNo.setProximoNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getProximoNo() != null) {
                    primeiroNo = primeiroNo.getProximoNo();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getDado();
        }
        return null;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = refNoEntradaFila;
            No<T> noAuxiliar = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getProximoNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getProximoNo();
                } else {
                    noAuxiliar.setProximoNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getDado();
        }
        return null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No<T> noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null) {
            while (true) {
                stringRetorno += "[No{objeto=" + noAuxiliar.getDado() + "}]--->";
                if (noAuxiliar.getProximoNo() != null) {
                    noAuxiliar = noAuxiliar.getProximoNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = null;
        }

        return stringRetorno;
    }
}