import java.security.SecureRandom;

public class matriz {
     //arrays bidimensionais (duas dimensões)
      // array de linhas e colunas
     
      public static void main(String[] args) {
         //int[][] numeros = new int[3][5];
         // 3 linhas e 5 colunas 
         final int linhas = 3;
         final int colunas = 5;
         int[][] numeros = new int[linhas][colunas];
        /*
          // o primeiro for percorre pelas linhas e o segundo pelas colunas
         for(int l = 0; l < linhas; l++) {
            for(int c = 0; c < colunas; c++) {
                numeros[l][c] = new SecureRandom().nextInt(100);
            }
         }
         for(int l = 0; l < linhas; l++) {
            for(int c = 0; c < colunas; c++) {
                System.out.printf("%d - " , numeros[l][c]);
            }
            System.out.printf("%n");
         }
         */
         geraDados(numeros, linhas, colunas);
         impDados(numeros, linhas, colunas);
      }

    public static void geraDados(int[][] matriz, int linhas, int colunas) {
        for(int l = 0; l < linhas; l++) {
            for(int c = 0; c < colunas; c++) {
                matriz[l][c] = new SecureRandom().nextInt(100);
            }
         }
    }

    public static void impDados(int[][] matriz, int linhas, int colunas) {
        for(int l = 0; l < linhas; l++) {
            for(int c = 0; c < colunas; c++) {
                System.out.printf("%d - " , matriz[l][c]);
            }
            System.out.printf("%n");
         }
    }
}
