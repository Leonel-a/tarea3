 
public class CaracolMatriz
{
    /**
     * Leonel Castro
     */
    public static void main (String[]args){
        int n=5;
        String [][] matriz = new String [n][n];
        int a=0;
        int b = n-1;
        int valor = 1;

        for (int  j=0; j< matriz.length;j++){
            //llenamos la fila superior→
            for (int  i = a; i <= b; i++){
                matriz [a][i]= valor ++ + " ";
            }
            //llenamos la columna del extremo derecho↓
            for (int  i = a + 1; i <= b; i++){
                matriz [i][b]= valor ++ + " ";
            }
            //llenamos la fila inferior de derecho a izquerda�?
            for (int  i = b - 1; i >= a; i--){
                matriz [b][i]= valor ++ + " ";
            }
            //llenamos la columna del extremo izquerdo de abajo hacia arriba↑
            for (int  i = b - 1; i >= a + 1; i--){
                matriz [i][a]= valor ++ + " ";  
            }
            a++;
            b--;
        }//fin ciclo externo
        //mostrar la matriz
        for(int f = 0; f < matriz.length; f++){
            for (int i = 0; i < matriz[f].length; i++){
                System.out.print(matriz[f][i]);
            }
            System.out.println();//cambiamos la fila , salto de linea
        }
    }
}