import java.util.*;

public class DiagonalPrincipalSecundariaMatriz {
     static int[][] matriz;
    public static void main(String[] args) {
        
        inicializar(matriz);
        visualizarMatriz(matriz);
        int[] diagoPrincipal = new int[matriz.length];
        int[] diagoSecundaria = new int[matriz.length];
                 
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(i==j){
                    diagoPrincipal[i] = matriz[i][j];
                }
                 
                if(i+j == matriz.length-1){
                    diagoSecundaria[i] = matriz[i][j];
                }
            }
        }
        System.out.println("\nDiagonal Principal");
        visualizarArray(diagoPrincipal);
         
        System.out.println("\n\nDiagonal Secundaria");
        visualizarArray(diagoSecundaria);
    }
     
    static void visualizarArray(int[] Array){
        for(int i=0;i<Array.length;i++){
            System.out.print("\t" + Array[i]);
        }
    }
     
    static void inicializar(int[][] pMatriz){
        int aux = 1;
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
     
    static void visualizarMatriz(int[][] pMatriz){
        System.out.println("\nVisualizando la matriz...\n");
        for(int i=0;i<pMatriz.length;i++){
            for(int j=0;j<pMatriz[i].length;j++){
                System.out.print("\t" + pMatriz[i][j]);
            }
            System.out.println();
        }
    }
}