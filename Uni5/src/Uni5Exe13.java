import java.text.DecimalFormat;
import java.util.Scanner;
public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Número total de reabastecimentos: ");
        int qtd = teclado.nextInt();

        double mediaParada = 0;
        int consume = 0;

        double mediaTotal = 0;

        for (int i = 0; i < qtd; i++) {
           System.out.println("Parada " + (i + 1));
           System.out.print("Quilometragem: "); 
           mediaParada = teclado.nextDouble();
           
           System.out.print("Combustivel: ");
           consume = teclado.nextInt();

            System.err.println("Parada " + (i + 1) + ": " + df.format((mediaParada / consume)) + " km por litro");
            System.out.println("================================");

            mediaTotal += (mediaParada / consume);
        }

        System.out.printf("Quilometragem média obtida por litro: %.2f", (mediaTotal / qtd));
    }
}
