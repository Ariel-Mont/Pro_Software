package Taller_20;
public class Procesar {
    public void procesar(int mat[][], int size, String cad){

        for(int i = 0; i<size; i++){
            cad += "\n";
            for(int k =0; k<size; k++){
               if(mat[i][k]%2 == 0){
                cad += " 1 ";
               }else{
                cad+= " 0 ";
               }
            }
        }
        Imprimir Procesar = new Imprimir();
        Procesar.imprimir(cad);}
}