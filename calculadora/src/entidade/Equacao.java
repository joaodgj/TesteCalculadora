
package entidade;

public class Equacao {
    
    private Operacoes operacao = null;
    private String primeiroNumero = "";
    private String segundoNumero = "";

   
    public Operacoes getOperacao() {
        return operacao;
    }

    public void setOperacao(Operacoes operacao) {
        this.operacao = operacao;
    }

    public String getPrimeiroNumero() {
        return primeiroNumero;
    }

    public void setPrimeiroNumero(String primeiroNumero) {
        this.primeiroNumero = primeiroNumero;
    }
    
    
    public String getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(String segundoNumero) {
        this.segundoNumero = segundoNumero;
    }
    
    public boolean validacaoCalculo(){
        if(this.operacao == null) return false;
        return true;
    }

}
