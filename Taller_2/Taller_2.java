//Hacer un programa que lea un numeros (entero) e imprima si el numero es positivo o negativo
/*Ariel Montoya 8-1019-1143
Jorshua Jimenez 
Lisbeth Magallon
*/
import java.util.Scanner;
public class Taller_2{
        public static void main(String[] args) {
        char user= 's';
        Scanner sc=new Scanner(System.in);
        
        
        while( user == 's'){
            System.out.print("Ingrese el numero entero: ");
            int num= sc.nextInt();
            if (num<0)
                System.out.println("El numero "+ num +" es negativo");    
            else               
                System.out.println("El numero "+ num +" es positivo");

            System.out.println("\n Desea continuar (s/n): ");
                user= sc.next().charAt(0);
        }
        sc.close();
    }

} 
