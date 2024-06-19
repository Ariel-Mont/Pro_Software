package Taller_15;
import javax.swing.JOptionPane;

public class Taller_15 {
    public int sum;
    public String res= "";
    public String val="";
    public void procesar(int n,int vec[], String val, String res){
        int i;
        for( i=0;i<n;i++){
            if(i==(n-1)/2||i==n-1||i==0 )
                sum+=vec[i];
         
            }  
            res+= ""+val+"\nLa suma del inicio, centro y medio es: "+ sum;
            imprimir(n,res);
        }
    
    public void imprimir(int n , String res){
    JOptionPane.showMessageDialog(null, "S A L I D A\n"+"Datos de entrada\n"+ "Dimension del vector: "+n+"\n"+res+"");
    }
}
