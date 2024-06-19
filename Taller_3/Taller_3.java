//Leer notas y poner si paso o no(Java's version)
import java.util.Scanner;

public class Taller_3 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese la nota: ");
            float nota= sc.nextFloat();
        sc.close();
        if(nota>60.5)
            System.out.println("El estudiante paso Java con "+ nota);
        else
                System.out.println("El estudiante no paso Java con "+ nota);
        }
}
