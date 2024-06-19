//Programa que carge una matriz n*n e imprimir la diagonal principal
package Taller_22;
import javax.swing.*;
public class Leer {
    public void leer(){
        String cad= "S A L I D A\n";
        int n= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tamaño de la matriz cuadrada: "));
        while(n<=1){
            n= Integer.parseInt(JOptionPane.showInputDialog(null,"Error, ingrese un tamaño mayor o igual a 2 en  la matriz: "));

        }
        int mat[][]= new int[n][n];
        cad+="El tamaño de la matriz es "+n+"*"+n+"\n";
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese los elementos de la matriz["+i+"]["+j+"]"));  
                if(mat[i][j]<10)
                   cad+="0"+mat[i][j]+"  ";
                else 
                    cad+=mat[i][j]+"  ";
            }   
            cad+="\n";
        }
        Procesar Leer= new Procesar();
        Leer.procesar(mat,n, cad);
    }
}
