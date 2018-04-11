
import javax.swing.JOptionPane;

public class Matriz {

    private int fila;
    private int columna;
    private int[][] m;

    public Matriz(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public int[][] getMatriz() {
        return m;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public void matriz() {

        m = new int[getFila()][getFila()];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                m[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite los datos dentro de la matriz"));
            }
        }
        

        System.out.println("");
        System.out.println("Diagonal Principal");
        for (int i = 0; i < getFila(); i++) {
            for (int j = 0; j < getColumna(); j++) {
                if (i == j) {
                    System.out.print(m[i][j] + " ");
                }
            }
        }
        System.out.println("\n");
        System.out.println("Diagonal Secundaria");
        for (int i = 0; i < getFila(); i++) {
            for (int j = 0; j < getColumna(); j++) {
                if (i == 0 && j == 2) {
                    System.out.print(m[i][j] + " ");
                }
                if (i == 1 && j == 1) {
                    System.out.print(m[i][j] + " ");
                }
                if (i == 2 && j == 0) {
                    System.out.print(m[i][j] + " ");
                }
            }
        }
        System.out.println("\n");
    }
    
    public void mostrarMatriz(){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                System.out.print(m[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
