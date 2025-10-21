import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int entrada = teclado.nextInt();

        for (int i = 8; i <= 500; i *= 2){
            System.out.println(i);
            int j = i + 2; 
            System.out.println(j);
            
        }
    }
}
