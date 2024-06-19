package Taller_20;
import javax.swing.*;

public class Leer{

    public void leer(){
        String cad= "S A L I D A\n";
        
        int size= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz: "));
        cad+="Tamaño del vector: "+size+"";
         int matriz[][]= new int[size][size];
        for(int i =0;i<size;i++){
              cad+="\n";
            for(int j=0;j<size;j++){
                matriz[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento de la matriz["+i+"]["+j+"]: "));
                cad+= matriz[i][j]+" ";
            }
        }
        Procesar Leer= new Procesar();
        Leer.procesar(matriz, size, cad);
    }

}