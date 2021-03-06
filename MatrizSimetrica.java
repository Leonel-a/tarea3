import java.util.Scanner;
 
public class MatrizSimetrica
 {
 
    static int[][] matriz;
 
    public static void main(String[] args) {
        inicializar();
        visualizar();
        System.out.printf("\nLa matriz %s simétrica.", esMatrizSimetrica()?"es":"no es");
    }
 
    static boolean esMatrizSimetrica(){
        for(int i=0; i < matriz.length; i++){
            for(int j=0; j < matriz[i].length ; j++){
                if(matriz[i][j] != matriz[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
 
    static void inicializar(){
        System.out.println("Inicializando la matriz...\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Dimensión de la matriz: ");
        int dim = sc.nextInt();
        matriz = new int[dim][dim];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.printf("Introduce el valor fila %d - columna %d: ", (i+1), (j+1));
                matriz[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
 
    static void visualizar(){
        System.out.println("\nVisualizando la matriz...\n");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}