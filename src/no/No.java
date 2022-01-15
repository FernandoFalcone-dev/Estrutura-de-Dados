package no;


public class No<T> {
    private T dado;
    private No<T> proximoNo;

    public No() {
        this.proximoNo = null;
    }

    public No(T dado) {
        this.dado = dado;
        this.proximoNo = null;
    }

    public No(T dado, No<T> proximoNo) {
        this.dado = dado;
        this.proximoNo = proximoNo;
    }

    public T getDado() {
        return this.dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getProximoNo() {
        return this.proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        String str = "No{" + "dado = " + dado + "}";

        if (proximoNo != null) {
            str += "-->" + proximoNo.toString();
        } else {
            str += "--> null";
        }
        return str;
    }

}
