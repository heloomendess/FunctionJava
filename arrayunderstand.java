public class arrayunderstand {

    public static void main(String[] args) {
        
    
    //coleção de variaveis do mesmo tipo

    // tipo do array
    // ao inves de: 
    // int num1, num2, num3, num4, num5;
     //int [] num = new int[5];
        int[] num = {52, 100, 3, 15, 354, 5453, 223};
    // ao inves de usar o num.lenght tbm pode ser usado o 
    // final int tamanho = 5;
    // int [] num = new int[tamanho];
    // e lá no for seria:
    // for(int = 0; i < tamanho; i++);

     //num[0] = 52;
     //num[1] = 100;
     //num[2] = 3;
     //num[3] = 15;
     //num[4] = 40;

    // lenght = the array size is set permanently when the array is initialized. 
    //the size or leght count of an array in java includes both null and non null characters.
    
    //for(int i = 0; i < num.length; i++) {
         //System.out.printf("%d%n", num[i]);
        // o "%n" serve para deixar um elemento em baixo do outro
        //}

    for(int n: num) {
        System.out.printf("%d%n", n);
    }
 }
}
