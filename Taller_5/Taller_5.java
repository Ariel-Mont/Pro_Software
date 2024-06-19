
package Taller_5;
//Programa que suma n cantidad de numeros consecutivos y lo imprima(for)
import java.util.Scanner;
public class Taller_5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        sc.close(); 
        
        System.out.println("Escriba un numero: ");       
        int n= sc.nextInt();
        int suma=0;
        for (int i=1;i<=n;i++)
            suma= suma+i;
        System.out.println("La suma de los"+n+"primeros numeros es"+ suma);
        sc.close();
        
}
}
