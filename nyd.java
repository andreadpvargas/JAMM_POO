
package Marlelly;

import javax.swing.JOptionPane;

public class nyd {
    
 public int d;

    public nyd(int d) {
        this.d = d;
    }
 
 public void numeros(){
     
     int n[]= new int[Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del vector"))];
     
     for(int i=0; i<n.length;i++){
         
         n[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite los numeros enteros"));
     }
     for(int i=0; i<n.length;i++){
         System.out.print(n[i]+" ");
     } 
        
	for(int i=0; i<n.length;i++){
        
        if(i%d==0){
            
            
             System.out.print(i+" ");
        }
    }
  
 }
}
     
 
 

