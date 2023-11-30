package files;

public class shell_sort {
    int i, j, temporal, pasadas;

    public void shell(int[] arreglo){
        int salto,i,j,k,auxiiar;
        salto = arreglo.length/2;
        while (salto>0) {
            for(i=salto;i<arreglo.length;i++){
                j=i-salto;
                while (j>=0) {
                    k=j+salto;
                    if (arreglo[j]<=arreglo[k]) {
                        j = -1;
                    }else{
                        auxiiar = arreglo[j];
                        arreglo[j] = arreglo[k];
                        arreglo[k] = auxiiar;
                        j-=salto;

                    }

                }
            }
            salto = salto/2;    
        }
        System.out.println("Arreglo ordenado");
        mostrar_arreglo(arreglo);
    }
    
    public void mostrar_arreglo(int[] arreglo){
        
        for(int i=0; i<arreglo.length; i++){
            System.out.print("["+arreglo[i]+"]");
        }
    }
    
}
