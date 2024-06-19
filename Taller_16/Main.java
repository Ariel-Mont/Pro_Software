package Taller_16;

import javax.swing.JOptionPane;

public class Main{
public static void main(String[] args) {

    while(true){
        Taller_16 main;
       main= new Taller_16();
        main.leer();
    int op=Integer.parseInt(JOptionPane.showInputDialog(null, "Desea continuar (s/n)"));
        if(op=='n'){
            break;
        }
}
}
}