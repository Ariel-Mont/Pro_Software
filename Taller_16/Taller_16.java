//Ariel Montoya 8-1019-1143
//Lisbeth Magallón 8-1009-2214
// Jorshua Jimenez 8-1012-2297
//Progeama que cargar un vector de n elemento e imprima el vector ordenado de mayor a menor
//tres metodos en el archivo Taller 16, llamar del Main el metodo leer.
//metodo leer envia a metodo procesar y del metodo procesar llevarlo de nuevo al metodo leer y del metodo leer lo manda al metodo imprimir.
package Taller_16;
import javax.swing.JOptionPane;
public class Taller_16{
    public  void leer(){
        int n;
        String cod="S A L I D A\n";
    
            n= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros"));
            int vec[]= new int[n];
            for(int i=0;i<n;i++){
                int res= Integer.parseInt(JOptionPane.showInputDialog("Ingrese los valores vec["+i+"]"));
                vec[i]=res;
                cod+= "vec["+i+"]="+vec[i]+"\n";
           
            }

            cod+= "vector ordenado=\n"+procesar(n,vec);
            JOptionPane.showMessageDialog(null, cod);
    }

    public String procesar(int n,int [] vec){
    String cad="";
        int j,i;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (vec[j] > vec[j + 1]) {
                    // intercambiar arr[j] y arr[j+1]
                    int temp = vec[j];
                    vec[j] = vec[j + 1];
                    vec[j + 1] = temp;
                }cad="vec["+i+"]="+ vec[i]+"\n";   
            }
            
        }
        
        return cad;
    }

    
}