
package teste;

import entidade.Operacoes;
import model.servico_calculadora.SolverCalculadora;

public class TesteSolverCalculadora {
    
    public static void main(String[] args) {
    
    SolverCalculadora sc = new SolverCalculadora();
    sc.getEquacao().setPrimeiroNumero("8.8");
    sc.getEquacao().setSegundoNumero("7");
    sc.getEquacao().setOperacao(Operacoes.SOMA);
    System.out.println("sc.fazConta()" + sc.fazConta());
}
}
