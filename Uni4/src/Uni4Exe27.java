import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de n (maior que 2): ");
        int n = sc.nextInt();

        if (n <= 2) {
            System.out.println("O valor de n deve ser maior que 2.");
        } else {
            int primeiro = 8; // primeiro termo do par
            int contador = 0; // total de números impressos

            for (; contador < n; primeiro *= 2) { // dobra a cada novo par
                // imprime o primeiro termo do par
                System.out.print(primeiro);
                contador++;

                if (contador == n) break;

                // imprime o segundo termo (primeiro + 2)
                System.out.print(", " + (primeiro + 2));
                contador++;

                if (contador < n) System.out.print(", ");
            }
        }
    }
}
