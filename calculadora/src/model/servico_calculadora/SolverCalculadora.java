
package model.servico_calculadora;

import entidade.Equacao;
import entidade.Operacoes;
import entidade.Conta;

public class SolverCalculadora {
    
    private Equacao equacao = new Equacao();
    
    public Equacao getEquacao(){
        return equacao;
    }
    
     public void setEquacao(Equacao equacao){
        this.equacao = equacao;
    }
    
    public double fazConta(){
        double primeiroNumero = Double.parseDouble(equacao.getPrimeiroNumero());
        double segundoNumero = Double.parseDouble(equacao.getSegundoNumero());
        Operacoes operacao = equacao.getOperacao();
        return operacao.getConta().calculaonta(primeiroNumero, segundoNumero);
    }
}
