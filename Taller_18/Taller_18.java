package Taller_18;

import javax.swing.JOptionPane;
public class Taller_18{

    public String leer(){ 
       String vector="S A L I D A\n";
       int n=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tamaño del vector"));
       int vec[]=new int[n];
       vector+= "Dimension del vector: "+n+"\n";
       for(int i=0; i<=n-1;i++){
           vec[i]= Integer.parseInt(JOptionPane.showInputDialog(null,"vec["+i+"]"));
   
           vector+= "vec["+i+"]="+vec[i]+"\n";
       }
       int val_new= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nuevo elemento del vector"));
       int  pos= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la posición del elemento"));
       int x=0;
       while(x==0){
        if(pos<=n-1&&pos>=0)
            break;
        else 
       pos= Integer.parseInt(JOptionPane.showInputDialog(null,"ERROR, posicion fuera de rango, ingrese un elemento desde la posicion 0 a "+(n-1)+""));
        }
       vector+= "El nuevo elemento es: "+val_new+"\nLa posición es: "+pos+"\n";
       return procesar(vector, n, pos, vec, val_new);
        
    }
    public String procesar(String vector,int n, int pos , int vec[],int val_new ){
        
        for(int i=0;i<=n-1;i++){
           
            if (i==pos){
                vec[i]= val_new;}
            vector+="vec["+i+"]= "+vec[i]+"\n";
        }
        return vector;
    }
}
