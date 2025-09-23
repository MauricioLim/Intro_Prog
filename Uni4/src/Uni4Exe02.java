import java.util.Scanner;

public class Uni4Exe02 {
    public static String verificacao(int numero){
        if (numero % 2 == 0) {
            return "Número é par";
        } else{
            return "Número é ímpar";
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();

        System.out.print(verificacao(numero));

        teclado.close();
    }
}
