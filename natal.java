import java.util.Scanner;

public class natal {
    public static void main(String[] args) {
      int dia = InserirData();
      int mes = InserirMes();
      verificacao(dia, mes);
    }

    public static int InserirData() {
        Scanner input = new Scanner(System.in);

        System.out.println("Que dia é hoje?");
        int dia = input.nextInt();

        return dia;
    }

    public static int InserirMes() {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira em números o mês do ano: ");
        int mes = input.nextInt();

        return mes;
    }

    public static void verificacao(int dia, int mes) {
        if(dia == 25 && mes == 12) {
            System.out.println("Hoje é natal!");
        } else {
            System.out.println("Hoje não é natal :(");
        }
    }
}
