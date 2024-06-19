package Taller_17;
import javax.swing.JOptionPane;






public class Taller_17{
    public void leer(){
    int n;
    String vector="";
    n=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tamaño del vector"));
    int vec[]=new int[n];
   
    for(int i=0; i<=n-1;i++){
        vec[i]= Integer.parseInt(JOptionPane.showInputDialog(null,"vec["+i+"]"));

        vector+= "vec["+i+"]="+vec[i]+"\n";
    }
    int val_new= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nuevo elemento del vector"));

    String cad_2= procesar(n,val_new);
    vector+= "Nuevo vector\n"+vector+cad_2;
    JOptionPane.showMessageDialog(null,"S A L I D A\nDimension del vector: "+n+"\n"+ vector);
    }
    public String procesar(int n,int val_new){
    
        String cad="vec["+(n)+"]="+val_new+"";
        return cad; 
    }
 
}