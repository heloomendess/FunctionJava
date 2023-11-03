import java.util.Scanner;

public class obterNumero6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = obterNumero(input);

        System.out.println("Você digitou o número: " + n);

        input.close();
    }
    /**
     * @param input
     * @return
     */
    public static int obterNumero(Scanner input) {
        int n = input.nextInt();
        return n;
    }
}
