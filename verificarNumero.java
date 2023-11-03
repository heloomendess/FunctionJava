import java.util.Scanner;

public class verificarNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = input.nextInt();
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor na posição " + i + ": ");
            vetor[i] = input.nextInt();
        }

        System.out.print("Digite o número que deseja verificar: ");
        int numeroDesejado = input.nextInt();

        int ocorrencias = contarOcorrencias(vetor, numeroDesejado);
        System.out.println("O número " + numeroDesejado + " ocorre " + ocorrencias + " vezes no vetor.");

        input.close();
    }

    public static int contarOcorrencias(int[] vetor, int numeroDesejado) {
        int ocorrencias = 0;
        for (int numero : vetor) {
            if (numero == numeroDesejado) {
                ocorrencias++;
            }
        }
        return ocorrencias;
    }
    }

