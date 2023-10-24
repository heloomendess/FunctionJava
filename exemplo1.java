import java.util.Scanner;

public class exemplo1 {
    public static int obterNumero() {
        System.out.println("Obter número");
        Scanner input = new Scanner(System.in);
        System.out.println("Números: ");
        int n = input.nextInt();
        return n;
    }
    static int minimo(int a, int b) {
        System.out.println("Mínimo");
        int min = 0;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;

            }
            public static void main(String[] args) {
        System.out.println("Main");
        int x = obterNumero();
        int y = obterNumero();
        int z = minimo(x, y);
                System.out.println("O número mínimo é: " + z);
        }
    }

    /* Void = não tem retorno
    - Variavel global: Fica numa posição que todo mundo enxerga ela
    Se mudar um valor muda de todos os lugares
    - Variavel local: Só é alterado localmente na variavel
     */