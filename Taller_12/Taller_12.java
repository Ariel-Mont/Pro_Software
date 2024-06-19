//Programa que lea dos numeros(enteros)
//e imprma la cantidad de numeros que hay entre ellos, sin incluirlos.
//Ariel Montoya 8-1019-1143
//Lisbeth Magallón 8-1009-2214
// Jorshua Jimenez 8-1012-2297
package Taller_12;

import javax.swing.JOptionPane;
public class Taller_12 {
    public void procesar(int n1, int n2){   
        int i;
        String cad= "";
        if( n1 < n2){
            for(i=n1+1;i< n2; i++)
                cad+= i+ ", ";
             }
         if( n1 > n2){
          for(i=n2+1;i< n1; i++)
              cad+= i+ ", ";
             }
        if (!cad.isEmpty()) {
                cad = cad.substring(0, cad.length() - 2); // Elimina la coma y el espacio al final
            }
        imprimir(n1,n2,cad);
}
public void imprimir(int n1,int n2, String cad){
    JOptionPane.showMessageDialog(null,"SALIDA"+"\n"+ "El intervalo de numeros entre"+n1+"y"+ n2+" es: \n"+cad);
}
}
