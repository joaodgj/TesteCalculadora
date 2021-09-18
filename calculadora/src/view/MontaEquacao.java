
package view;

import entidade.Equacao;
import entidade.Operacoes;

public class MontaEquacao {
    
    private Equacao equacao = new Equacao();
    enum Estado{MONTANDO_PRIMEIRO_NUMERO, MONTANDO_SEGUNDO_NUMERO}
    Estado estado = Estado.MONTANDO_PRIMEIRO_NUMERO;
    
    
    public Equacao getEquacao() {
        return equacao;
    }

    public void setEquacao(Equacao equacao) {
    this.equacao = equacao;
    }
    public void addDigito(char digito){
        switch(estado){
            case MONTANDO_PRIMEIRO_NUMERO:
                addDigitoPrimeiroNumero(digito);
                break;
            case MONTANDO_SEGUNDO_NUMERO:
                addDigitoSegundoNumero(digito);
                break;
        }
    }

   public void addDigitoPrimeiroNumero(char digito){
       equacao.setPrimeiroNumero(equacao.getPrimeiroNumero()+digito);
   }
   public void addDigitoSegundoNumero(char digito){
       equacao.setSegundoNumero(equacao.getSegundoNumero()+digito);
   } 
   public void setOperacao(Operacoes op){
       estado = Estado.MONTANDO_SEGUNDO_NUMERO;
       equacao.setOperacao(op);
   }
}
