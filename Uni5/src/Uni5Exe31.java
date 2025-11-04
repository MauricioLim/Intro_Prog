import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = teclado.nextInt();
        
        System.out.println("número\tdecomposição");
        System.out.println(numero);
        
        int divisor = 2;
        
        while (numero > 1) {
            if (numero % divisor == 0) {
                numero = numero / divisor;
                System.out.println(numero + "\t" + divisor);
            } else {
                divisor++;
            }
        }
        
        System.out.println("1");
        
        teclado.close();
    }
}