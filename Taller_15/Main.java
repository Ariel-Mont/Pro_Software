
package Taller_15;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {
      int i,n,x=0;
      String val="";
      String res=""; 
      do{ 
        n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimensión del vector: "));
       int vec[]= new int[n];
       if(n%2!=2){
        for (i=0; i<n;i++){
            vec[i]=Integer.parseInt(JOptionPane.showInputDialog("vec["+(i+1)+"]"));
            val+="vec["+(i+1)+"]= "+vec[i]+'\n';
        }
        Taller_15 Main;
        Main= new Taller_15();
        Main.procesar(n,vec,val,res);

        x=1;
        
    }
        else
            JOptionPane.showMessageDialog(null, "Error, ingrese un numero valido");

             
        }while(x!=1);
            
    }
}
