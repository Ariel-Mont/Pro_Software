package Taller_21;
public class Procesar {
    public void procesar(int mat[][],int n, String cad){
        cad+= "Diagonal principal de la matriz:\n";
        for(int i=0;i<n;i++){    
        for(int j=0;j<n;j++){
            if(i==j){
            if(mat[i][j]<10)
                cad+="0"+mat[i][j];
            else
                cad+=mat[i][j];
            }
            else
                cad+="     ";
        }
        cad+="\n";
    }
    Imprimir Procesar= new Imprimir();
    Procesar.imprimir(cad);
    }
}
