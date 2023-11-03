import java.util.ArrayList;
import java.util.Scanner;

public class separarImpar4 {
        public static int[] separarNuImpar(int[] vetor) {
        ArrayList<Integer> numerosImpar = new ArrayList<>();

        for(int num : vetor) {
            if(num % 2 != 0) {
                numerosImpar.add(num);
            }
        }
        int[] result = new int[numerosImpar.size()];
        for (int i = 0; i < numerosImpar.size(); i++) {
            result[i] = numerosImpar.get(i);
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

        int[] numerosImpar = separarNuImpar(vetor);
            System.out.println("Números pares no vetor: ");
            for (int num : numerosImpar) {
                System.out.println(num + " ");
            }
        }
}
