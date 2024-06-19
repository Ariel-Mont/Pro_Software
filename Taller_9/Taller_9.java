import java.util.Scanner;

public class Taller_9 {

    public float n1, n2;
    public char cara;
    public String cad;
     Scanner sc = new Scanner(System.in);

    public void leer() {
        System.out.print("\ningrese el primer numero: ");
        n1 = sc.nextFloat();
        System.out.print("\ningrese el segundo numero: ");
        n2 = sc.nextFloat();
        System.out.print("\ningrese el signo (+,-,*,/): ");
        cara = sc.next().charAt(0);
        
    }

    public void procesar() {
        switch (cara) {
            case '+':
                cad += "la suma de " + n1 + " y " + n2 + " es de " + (n1 + n2);
                break;
            case '-':
                cad += "la resta de " + n1 + " y " + n2 + " es de " + (n1 - n2);
                break;
            case '*':
                cad += "la multiplicacion de " + n1 + " y " + n2 + " es de " + (n1 * n2);
                break;
            case '/':
                if (n2 == 0)
                    cad += "no se puede dividir entre cero";
                else
                    cad += "la division de " + n1 + " y " + n2 + " es de " + (n1 / n2);
                break;
            default:
                cad += "caracter no permitido";
                break;
        }
    }

    public void imprimir() {
        System.out.print(cad);
    }

    public static void main(String[] args) {
        Taller_9 taller_9;
        taller_9 = new Taller_9();
        taller_9.leer();
        taller_9.procesar();
        taller_9.imprimir();
    }
}