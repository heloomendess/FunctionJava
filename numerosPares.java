import java.util.Scanner;

public class numerosPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos números você deseja inserir?");
        int quantNumeros = input.nextInt();

        int[] numeros = new int [quantNumeros];

        for (int i = 0; i < quantNumeros; i++) {
            System.out.println("Vetor: " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        System.out.println("\n Números pares: ");
        printPares(numeros);

        input.close();
    }
    public static void printPares(int[] numeros) {
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            } 
        }
    }
}
