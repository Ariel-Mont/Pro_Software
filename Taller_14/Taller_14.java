
//programa que carga un vector de n elementos(enteros) e imprima la suma de los numeros pares e impares
////Lisbeth Magallón 8-1009-2214  Ariel Montoya 8-1019-1143 Jorshua Jimenez 8-1026-2297
import javax.swing.*;
public class Taller_14 {
    public String cad = "";
    public String leer(){
        int i,n;
        int vec[] = new int[25];
        n = Integer.parseInt(JOptionPane.showInputDialog("ingrese la dimencion del vector "));
        for(i=1; i<=n;i++){
            vec[i] = Integer.parseInt(JOptionPane.showInputDialog("vec["+ i + "]"));
        }
        procesar(n,i,vec);
        return cad;
    }
    public String procesar(int i, int n, int vec[]){
        int supa =0, suim =0;

        for(i=1; i<n; i++){
            if(vec[i]%2 == 0){
                supa += vec[i];
            }else
                suim += vec[i];
        }

        cad += "la suma de los numeros pares es: " + supa + "\nla suma de los numeros impares es de "+ suim;
        return cad;
    }
}