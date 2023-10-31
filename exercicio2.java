import java.util.Scanner;

public class exercicio2 {
    public static int tamanho() {
        System.out.println("Tamanho do vetor");
        Scanner input = new Scanner(System.in);
        System.out.println("Tamanho: ");
        int tamanho = input.nextInt();
        return tamanho;
    }

    public static int[] criarVetor(int tamanho) {
        System.out.println("Criar vetor");
        int[] vetor = new int[tamanho];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Vetor[%d]: \n", i);
            vetor[i] = input.nextInt();
        }
        return vetor;
    }
}
