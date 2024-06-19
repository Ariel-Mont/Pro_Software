//Programa que lea 3 numeros y dija cual es el menor, mayor y mediano
package Taller_8;

import java.util.Scanner;

public class Taller_8 {
    public int n1, n2, n3;
    public String cad=   "";
    Scanner sc= new Scanner(System.in);

    public void leer(){
        System.out.println("Ingrese el primer numero: ");
        n1= sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2= sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        n3= sc.nextInt();
    }
    public void procesar() {
        if(n1 > n2 && n2 > n3)
            cad = cad + "Mayor = " + n1 + "\nMedio = " + n2 + "\nMenor = " + n3;
            else
                if(n1 > n3 && n3 >n2)
                    cad = cad + "Mayor = " + n1 + "\nMedio = " + n3 + "\nMenor = " + n2;
                    else 
                        if(n2 > n1 && n1 > n3)
                                cad = cad + "Mayor = " + n2 + "\nMedio = " + n1 + "\nMenor = " + n3;
                                else 
                                    if(n2 > n3 && n3 > n1)
                                        cad = cad + "Mayor = " + n2 + "\nMedio = " + n3 + "\nMenor = " + n1;
                                        else 
                                            if(n3 > n2 && n2 > n1)
                                                cad = cad + "Mayor = " + n3 + "\nMedio = " + n2 + "\nMenor = " + n1;
                                                //else:
                                                
                                                
                    

    }




}
    

