package Taller_7;
//Programa que lea una nota en numero( decimal), e imprima
//la nota en letra (if-else)
//Lisbeth Magallón 8-1009-2214 
// Ariel Montoya 8-1019-1143 
//Jorshua Jimenez 8-1026-2297
import java.util.Scanner;

public class Taller_7{

    public float nota;
    public String letra;
    Scanner sc= new Scanner(System.in);
    
    public void leer(){
        System.out.println("Ingrese la nota (decimal): ");
        nota = sc.nextFloat();
    }
    public void procesar(){
        if(nota >= 90.5 && nota<=100)
        letra= "A";    
        else 
            if(nota >= 80.5 && nota< 90.5)
                letra= "B";
            else 
                if(nota >= 70.5 && nota< 80.5)
                    letra= "C";
                else 
                    if(nota >= 60.5 && nota< 70.5)
                        letra= "D";
                    else 
                        if(nota >=0 && nota < 60.4)
                            letra= "F";
                        else
                            if(nota < 0 || nota > 100)
                                letra = "Nota fuera de rango";
                                
    }
    public void imprimir(){
        System.out.println("La nota "+nota+ " equivale a una "+letra);

    }
    






    public static void main(String[] args) {
        Taller_7 taller_7;
        taller_7= new Taller_7();
        taller_7.leer();
        taller_7.procesar();
        taller_7.imprimir();
    
    }
}