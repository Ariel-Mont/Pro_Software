// Hacer un programa que lea dos números(enteros) e imprima el número mayor y menor.
//Ariel Montoya 8-1019-1143
//Lisbeth Magallon 

import java.util.Scanner;
public class Taller_1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        sc.close();
        System.out.print("Ingrese el Primer número: ");
    int n1 =sc.nextInt();
   System.out.print("Ingrese el Segundo número: ");
    int n2 =sc.nextInt();
    if (n1 < n2)
        System.out.print("El numero "+ n1 + " es menor que el numero "+ n2);
    else 
        if(n1 > n2)
            System.out.print("El numero "+ n1 + " es menor que el numero "+ n2);
        else 
            System.out.print("El numero " +n1+ " es igual al numero "+ n2);
 
}

}