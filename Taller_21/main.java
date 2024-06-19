package Taller_21;
//Programa que carge una matriz n*n e imprimir la diagonal principal
//Ariel Montoya 8-1019-1143
//Lisbeth Magallón 8-1009-2214
// Jorshua Jimenez 8-1012-2297
import javax.swing.JOptionPane;
public class main {
    public static void main(String[] args) {
             char op='s';
        while(op=='s'||op=='S'){
        Leer main= new Leer();
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