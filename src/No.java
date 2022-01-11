
public class No<T> {
    // Utiliza T genérico para indicar que o conteúdo poderá ser de qualquer tipo
    private T dado; 
    private No<T> refNo;

    public No(T dado) {
        this.dado = dado;
        this.refNo = null;
    }

    public T getDado() {
        return this.dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getRefNo() {
        return this.refNo;
    }

    public void setRefNo(No<T> refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return
            "dado = '" + getDado() + "'";
    }

}
