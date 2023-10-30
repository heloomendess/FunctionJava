import java.sql.SQLOutput;
import java.util.Scanner;
public class ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 10;
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Digite um número: ");
            vetor[i] = input.nextInt();
        }
        int soma = 0;
        int menor = vetor[0];
        int maior = vetor[0];
        for(int i = 0; i < n; i++) {
            soma += vetor[i];
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        for (int i = 0; i < n; i++){
            System.out.printf("Vetor[%d]: %d", i, vetor[i]);
            if (vetor[i] == menor){
                System.out.printf("   <----Menor");
            } else if(vetor[i] == maior){
                System.out.printf("   <----Maior");
            }
            System.out.println("");
        }
        System.out.println(soma);
    }
}