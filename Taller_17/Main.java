//Programa que carga un vector de n elementos, Ingresar un nuevo
// elemento en la posición (n+1), e imprima el nuevo vector.
package Taller_17;
import javax.swing.JOptionPane;
public class Main{
    public static void main(String[] args) {
        char op='s';
        while(op=='s'||op=='S'){
        Taller_17 main= new Taller_17();
        main.leer();
        op=JOptionPane.showInputDialog(null, "Desea continuar(s/n)").charAt(0);
        while(op!='s'&&op!='S'&& op!='n'&&op!='N'){
        op=JOptionPane.showInputDialog(null, "Error, ingrese s o n").charAt(0);
        }
        if(op=='n'||op=='N'){
        JOptionPane.showMessageDialog(null, "Gracias");
        }
    }

        
    }
}