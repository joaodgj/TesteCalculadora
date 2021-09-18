package controller;

import entidade.Equacao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.servico_calculadora.SolverCalculadora;
import view.ViewCalculadora;

public class Controller {
    
    ViewCalculadora view;
    SolverCalculadora model;
    
    public Controller(ViewCalculadora aView, SolverCalculadora aModel){
        this.view = aView;
        this.model = aModel;
        view.setVisible(true);
        view.adicionarAcaoResultado(new CalculaResultado());
       
    }
   
    class CalculaResultado implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Equacao equacao = view.getEquacao();
            model.setEquacao(equacao);
            double resultado = model.fazConta();
            view.mostraResultado(resultado);
        }
        
    }
    
}
