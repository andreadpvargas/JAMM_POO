
package Marlelly;

import javax.swing.JOptionPane;


public class Respuestanyd {

    
    
    public static void main(String[] args) {
        
        nyd nn= new nyd(0);
        
        nn.d=Integer.parseInt(JOptionPane.showInputDialog("Digite el multiplo"));
        nn.numeros();
        
        
    }
    
}
