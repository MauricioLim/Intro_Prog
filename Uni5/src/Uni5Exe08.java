import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menor = 0;
        int media = 0;
        int contador = 0;

        System.out.print("N: ");
        int entrada = teclado.nextInt();

        for (int i = entrada; i > 0; i--) {
            entrada = teclado.nextInt();

            if (entrada > 0){
                media += entrada;
                contador++;
            }
            if (entrada < menor) {
                menor = entrada;
            }
        }

        System.out.println("Menor valor negativo " + menor);
        System.out.println("Média dos números positivos: " + (media / contador));
    }
}
