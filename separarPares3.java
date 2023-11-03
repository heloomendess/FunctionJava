import java.util.ArrayList;
import java.util.Scanner;

public class separarPares3 {

    public static int[] separarNuPares(int[] vetor) {
        ArrayList<Integer> numerosPares = new ArrayList<>();

        for(int num : vetor) {
            if(num % 2 == 0) {
                numerosPares.add(num);
            }
        }
        int[] result = new int[numerosPares.size()];
        for (int i = 0; i < numerosPares.size(); i++) {
            result[i] = numerosPares.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int size = input.nextInt();
        int[] vetor = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.println("Digite o elemento " + (i + 1) + ": " );
            vetor[i] = input.nextInt();
        }

        int[] numerosPares = separarNuPares(vetor);
            System.out.println("Números pares no vetor: ");
            for (int num : numerosPares) {
                System.out.println(num + " ");
            }
        }
    }

