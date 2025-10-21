import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor = 0;
        double entrada;
        double menor = 999999;
        double maior = 0;


        System.out.print("n: ");
        int n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            entrada = teclado.nextDouble();
            valor += entrada;
            
            if (entrada > maior){
                maior = entrada;
            }

            if (entrada < menor){
                menor = entrada;
            }

        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
