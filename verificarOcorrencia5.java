import java.util.Scanner;

public class verificarOcorrencia5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = {0, 1, 2, 3, 4, 5, 10, 15, 20, 25, 30};
        boolean found = false;

        System.out.println("Digite o número que deeseja verificar: ");
        int num = input.nextInt();

        for (int numero : numeros) {
            if (numero == num) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("O número " + num + " foi encontrado no array.");
        } else {
            System.out.println("O número " + num + " não foi encontrado no array.");
        }
        input.close();
    }
}
