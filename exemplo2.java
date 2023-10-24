import java.util.Scanner;
public class exemplo2 {

    public static int menu() {

        int op;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("menu");
            System.out.println("1- Adição");
            System.out.println("2- Subtração");
            System.out.println("3- Multiplicação");
            System.out.println("4- Divisão");

            System.out.println("Escolha uma operação: ");
            op = input.nextInt();
            if (op < 1 || op > 4) {
                System.out.println("Operação Inválida");
                System.out.println("Escolha uma opção");
            }
        } while(op < 0 || op > 4);
        return op;
    }
    public static float entradaDeDados() {
        System.out.println("Entrada de dados");
        Scanner input = new Scanner(System.in);
        System.out.println("Números: ");
        float n = input.nextInt();
        return n;
    }

    public static float somar(float n1, float n2) {
        System.out.println("Somar");
        return n1 + n2;
    }
    public static float subtrair(float n1, float n2) {
        System.out.println("Subtrair");
        return n1 - n2;
    }
    public static float multiplicar(float n1, float n2) {
        System.out.println("Multiplicar");
        return n1 * n2;
    }
    public static float dividir(float n1, float n2) {
        System.out.println("Dividir");
        return n1 / n2;
    }
    public static void imprimir(float result) {
        System.out.println("Imprimir");
        System.out.println("Resultado da operação: " + result);
    }
    public static float controlador(int op, float n1, float n2) {
        System.out.println("Controlador");
        float result = 0;
        switch (op) {
            case 1:
                result = somar(n1, n2);
                break;
            case 2:
                result = subtrair(n1, n2);
                break;
            case 3:
                result = multiplicar(n1, n2);
                break;
            case 4:
                result = dividir(n1, n2);
                break;

        }
        return result;
    }
    public static void main(String[] args) {
        int op = menu();
        float n1 = entradaDeDados();
        float n2 = entradaDeDados();
        float r = controlador(op, n1, n2);
        imprimir(r);
    }
}
