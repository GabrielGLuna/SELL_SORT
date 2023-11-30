import files.shell_sort;
public class arreglos {
    public static void main(String[] args){
        int arreglo[] ={3,5,2,8,9,5,3,5,89,0,78,6};   
        shell_sort arr = new shell_sort();
        System.out.println("Arreglo Original");
        arr.mostrar_arreglo(arreglo);
        System.out.println();
        arr.shell(arreglo);
        
    }
}
