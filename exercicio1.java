import java.util.Scanner;

public class exercicio1 {
    static int n = 10;
    static int[] vetor = new int[n];
    public static Scanner input = new Scanner(System.in);

    public static void vetor(){
        for (int i = 0; i < n; i++){
            System.out.println("Vetor: " + i);
            vetor[i] = input.nextInt();
        }
    }

    public static int soma(){
        int soma = 0;
        int menor = vetor[0];
        int maior = vetor[0];

        for (int i = 0; i < n; i++){
            soma += vetor[i];
            if (vetor[i] < menor){
                menor = vetor[i];
            }
            if (vetor[i] > maior){
                maior = vetor[i];
            }
        }
        comparar(menor, maior, soma);
        return soma;
    }

    public static void comparar(int menor, int maior, int soma){
        for (int i = 0; i<n; i++){
            System.out.printf("Vetor[%d]: %d", i, vetor[i]);
            if (vetor[i] == menor){
                System.out.printf("  <--- maior");
            } else if(vetor[i] == maior){
                System.out.printf("  <----Maior");
            }
            System.out.println("");
        }
        System.out.println(soma);
    }

    public static void main(String[] args) {
        vetor();
        soma();
    }
}