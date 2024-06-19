
package Taller_12;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int n1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        int n2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero "));
        Taller_12 Main;
        Main = new Taller_12();
        Main.procesar(n1, n2);
    }

}
