package Taller_6;
//Programa que lea n cantidad de números, e imprima la suma
//De los números positivos y negativos(for)
//Lisbeth Magallón 8-1009-2214  
//Ariel Montoya 8-1019-1143 
//Jorshua Jimenez 8-1026-2297
import java.util.Scanner;

public class Taller_6 {
    public int i, n, num, supo = 0, sune =0;
    Scanner sc = new Scanner(System.in);
     public void leer() {
        System.out.print("Ingrese la cantidad de numeros: ");
         n = sc.nextInt();
        
    }

    public void procesar(){
        if (n >= 0) {
            for(i=1; i<= n; i++){
                System.out.print("Num["+ n+ "]     ");
                num = sc.nextInt();
                if(num<0){
                    sune = sune + num;
                }else supo = supo + num;
            }
            sc.close();
        }else{
            System.out.print("error papu, no puedes con lo negativos"); 
        }
        }

    public void impprimir(){
               
        System.out.print("la suma de los negativos  es de: "+ sune);
               
        System.out.print("\nla suma de los positivos  es de: "+ supo);
    }
    public static void main(String[] args) {
        Taller_6 taller_6;
        taller_6 = new Taller_6();
        taller_6.leer();
        taller_6.procesar();
        taller_6.impprimir();
        
    }
}
