package Taller_18;
//Ariel Montoya 8-1019-1143
//Lisbeth Magallón 8-1009-2214
// Jorshua Jimenez 8-1012-2297
//Programa que carga un vector de n elementos, Ingresar un nuevo elemento en una posición dada, e imprimir el nuevo vector
import javax.swing.JOptionPane;
public class Main{
    public static void main(String[] args) {
        char op='s';
        while(op=='s'||op=='S'){
        Taller_18 main= new Taller_18();
        JOptionPane.showMessageDialog(null,main.leer());
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