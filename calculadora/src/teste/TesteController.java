package teste;

import model.servico_calculadora.SolverCalculadora;
import view.ViewCalculadora;

public class TesteController {
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new controller.Controller(new ViewCalculadora(), new SolverCalculadora());
            }
        });
    }
}
