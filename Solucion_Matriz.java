
import javax.swing.JOptionPane;


public class Solucion_Matriz {

    public static void main(String[] args) {
        
        Matriz m = new Matriz(0, 0);
        
        m.setFila(Integer.parseInt(JOptionPane.showInputDialog("Digite n1")));
        m.setColumna(Integer.parseInt(JOptionPane.showInputDialog("Digite n2")));
        
        
        m.matriz();
        m.mostrarMatriz();
        
        int tamannio=m.getMatriz().length-1;
        int superiorIzquierda=m.getMatriz()[0][0];
        m.getMatriz()[0][0]=m.getMatriz()[tamannio][tamannio];
        m.getMatriz()[tamannio][tamannio]=superiorIzquierda;
        superiorIzquierda=m.getMatriz()[2][0];
        m.getMatriz()[2][0]=m.getMatriz()[0][tamannio];
        m.getMatriz()[0][tamannio]=superiorIzquierda;
        
        m.mostrarMatriz();
        
        
        
        
        
    }
    
}
