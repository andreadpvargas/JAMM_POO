package taller.pkg1.semana.pkg10;

import javax.swing.JOptionPane;

class Metodo {

    public void all() {
        int multi = 1;
        int multi1 = 1;

        int[] array1 = new int[3];
        int[] array2 = new int[3];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite valor para array1: "));

        }
        for (int i = 0; i < array1.length; i++) {
            multi = multi * array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite valor array2: "));
        }

        for (int i = 0; i < array2.length; i++) {
            multi1 = multi1 * array2[i];
        }

        System.out.println("De mayor a menor: ");

        if (multi > multi1) {
            System.out.println("Total Multiplicacion array1: " + multi);
            System.out.println("Total Multiplicacion array1: " + multi1);
        } else {
            System.out.println("Total Multiplicacion array1: " + multi1);
            System.out.println("Total Multiplicacion array1: " + multi);
        }

        int sumatotal = multi + multi1;
        System.out.println("Suma de pruductos: " + sumatotal);
    }

}
