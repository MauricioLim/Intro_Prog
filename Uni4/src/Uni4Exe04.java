import java.util.Scanner;

public class Uni4Exe04 {
   public static String verificacao(float numero){
    if (numero % 1 != 0) {
        return "Casas decimais foram digitadas";
    } else {
        return "Casas decimais não foram digitadas";
    }
   } 

   public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    float numero = teclado.nextFloat();

    System.out.print(verificacao(numero));


    teclado.close();
   }
}
