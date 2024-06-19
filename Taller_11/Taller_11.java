//programa que lea n cantidad de numeros entera e imprima el menor y mayor de todos ellos.
//Ariel Montoya 8-1019-1143
//Lisbeth Magallón 8-1009-2214
// Jorshua Jimenez 8-1012-2297
package Taller_11;
import javax.swing.JOptionPane;
public class Taller_11 {
    public void leer(){
        int n= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros: "));
        procesar(n);

    }

    public void procesar(int n){
        int i, men, may, num= Integer.parseInt(JOptionPane.showInputDialog("Num[1]= "));
        men=num; may=num;
        for(i=2;i<=n;i++){
            num= Integer.parseInt(JOptionPane.showInputDialog("Num["+i+"]= "));
            if(num<men)
                men= num;
            if (num>may)
                may=num;
        }
        imprimir(men,may);
    }
    public void imprimir(int men, int may){
        JOptionPane.showMessageDialog(null,"SALIDA"+"\n"+ "El numero menor es "+men+"\n"+"El   numero mayor es "+may);


    }
}
