
package entidade;

public enum Operacoes {
    SOMA((a, b) -> a+b, '+'), 
    SUBTRACAO((a, b) -> a-b, '-'), 
    MULTIPLICACAO((a, b) -> a*b, '*'), 
    DIVISAO((a, b) -> a/b, '/');

Conta conta;
char representacao;


Operacoes(Conta aConta, char aRepresentacao){
        this.conta = aConta;
        this.representacao = aRepresentacao;
}
public Conta getConta(){
    return this.conta;
}

public char getRepresentacao(){
    return this.representacao;
}

    static class FazMultiplicacao implements Conta{

        @Override
        public double calculaonta(double primeiroNumero, double segundoNumero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }   
    }
}