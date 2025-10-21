import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        System.out.println("=============");
        int cont = 1;

        for (int i  = 0; i < n; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print( cont + " ");
                cont ++;
            }
            System.out.println();
        }
    }
}
