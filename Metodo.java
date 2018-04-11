
package arbolito;


public class Metodo {
    
    int[] arreglo1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    public void imprimirArray(){
        System.out.println("                " +arreglo1[0]);
        System.out.println("             /"  + "      \\  ");
        System.out.println("            " + arreglo1[1]+"        " + arreglo1[2 ]);
        System.out.println("          /   \\    /   \\");
        System.out.println("         " + arreglo1[3]+ "     " + arreglo1[4] + "  " + arreglo1[5] + "     " + arreglo1[6]);
        System.out.println("       /   \\");
        System.out.println("      " + arreglo1[7] + "     " + arreglo1[8]);
    }
    
    public void sumaArray(){
        
        int sumaA = arreglo1[0] + arreglo1[1] + arreglo1[2] + arreglo1[3] + arreglo1[4] + arreglo1[5] + arreglo1[6] + arreglo1[7] + arreglo1[8];
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("La suma del arbol es: " + sumaA);
    }
    
}
