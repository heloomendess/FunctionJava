
public class function {
    public static void main(String[] args) {
        soma(12, 20);
        calc(10, 5);
        //pode dar quantos valores quiser para o parametro executar
    }
    static void soma(int x, int y) { //parâmetro
        //soma = geralmente usamos um verbo para o nome da função de acordo com o que ela faz
        //os parenteses () nós usamos para definir o que chegará na função; sempre definir o tipo da variável e o nome dela

        System.out.println("Total soma: " + (x + y));
    }
    static void calc(int x, int y) {
        System.out.println("Total calc: " + (x + y));
        System.out.println("Total calc: " + (x - y));
        System.out.println("Total calc: " + (x * y));
        System.out.println("Total calc: " + (x / y));
    }
}

