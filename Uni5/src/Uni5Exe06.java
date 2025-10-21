import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        double valor = 0;

        for (int i = 0; i < 20; i++) {
            Scanner teclado = new Scanner(System.in);  
            System.out.print("Altura da pessoa " + (i + 1) + ": ");
            valor += teclado.nextDouble();
        }

        System.out.println("A média das alturas é: " + (valor / 20));
    }
}
