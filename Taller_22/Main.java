package Taller_22;

import javax.swing.JOptionPane;
public class Main {
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