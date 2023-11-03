import java.util.Scanner;

public class numerosImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos números você deseja inserir?");
        int quantNu = input.nextInt();

        int[] numeros = new int [quantNu];

        for (int i = 0; i < quantNu; i++) {
            System.out.println("Vetor: " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }
        System.out.println("\nNúmeros Impar");
        printImpar(numeros);

        input.close();
    }
    public static void printImpar(int[] numeros) {
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
        }
    }
}
