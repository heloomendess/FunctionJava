import java.util.Scanner;
public class Array {

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

    public static int somatorio(int[] vetor, int tamanho) {
        int soma = 0;

        for (int i = 0; i < tamanho; i++) {
            soma += vetor[i];
        }
        System.out.println("Total: " + soma);
        return soma;
    }

    public static float media(int[] vetor, int tamanho) {
        int soma = 0;
        int media = 0;

        for (int i = 0; i < tamanho; i++) {
            soma += vetor[i];

        }
        media = soma / vetor.length;
        System.out.println("Sua média é: " + media);
        return media;
    }

    public static int obtemElemento(int[] vetor, int tamanho) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual posição você deseja verificar? ");
        int resposta = input.nextInt();
        if (resposta <= tamanho) {
            System.out.println("Valor antigo do vetor " + resposta);
        } else {
            System.out.println("A posição não foi encontrada.");
        }
        return resposta;
    }

    public static void insereElementoVetor(int[] vetor, int tamanho, int resposta) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual elemento você deseja substituir? ");
        int elemento = input.nextInt();
        vetor[resposta] = elemento;
        System.out.println("O elemento " + elemento + " foi adicionado.");
    }

    public static void substituiImparPorZero(int[] vetor, int tamanho) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                vetor[i] = 0;
            }
            System.out.println(vetor[i]);
        }
    }

    public static void main(String[] args) {
        int t = tamanho();
        int[] v = criarVetor(t);
        somatorio(v, t);
        media(v, t);
        int obtEle = obtemElemento(v, t);
        insereElementoVetor(v, t, obtEle);
        substituiImparPorZero(v, t);
    }
}