package Taller_4;
//Programa que imprima una vocal(if)

import java.util.Scanner;

public class Taller_4 {
 public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        sc.close();
    System.out.print("Ingrese una letra: ");
    char letra= sc.next().charAt(0);
    if(letra=='A' || letra=='E' || letra=='I'|| letra=='O' ||letra=='U'|| 
       letra=='a' ||  letra=='e' || letra=='i'|| letra=='o' ||letra=='u')
        System.out.print("La letra ingresada "+ letra+ " es una vocal");
    else
        System.out.println("La letra ingresada "+ letra+ " no es una vocal");
    }
}
 