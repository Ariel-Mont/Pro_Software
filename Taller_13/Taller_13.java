//programa que imprima la tabla de multiplicar que ingrese el usuario
//Lisbeth Magallón 8-1009-2214  Ariel Montoya 8-1019-1143 Jorshua Jimenez 8-1026-2297
import javax.swing.*;
public class Taller_13 {

    public void procesar(int n){
        int i;
        String cad= "";
        for(i=0;i<=12;i++){
            cad+= n+"*"+i+"="+(n*i)+"\n";
        }
        imprimir(n,cad);
    }

    public void imprimir(int n , String cad){
    JOptionPane.showMessageDialog(null,"S A L I D A\n" +
    "Datos de Entrada\n"+"Tabla de multiplicar del "+ n+ "\n"+ cad);
}
}
