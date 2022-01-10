
public class No<T> {
    // Utiliza T genérico para indicar que o conteúdo poderá ser de qualquer tipo
    private T conteudo; 
    private No<T> proximoNo;

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public T getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximoNo() {
        return this.proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    // @Override
    // public String toString() {
    //     return
    //         "conteudo= '" + getConteudo() + "'";
    // }

}
