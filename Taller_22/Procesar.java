package Taller_22;
public class Procesar {
    public void procesar(int mat[][],int n, String cad){
        int posi = 1, num = n;
        cad+= "Diagonal secundaria de la matriz:\n";
        for(int i=0;i<n;i++){    
        for(int j=0;j<n;j++){
            if((num-1)==j ){
                num=-1;
            if(mat[posi][j]<10)
                {cad+="0"+mat[posi][j];
                posi++;}
            else
                cad+=mat[posi][j];
                posi++;
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
