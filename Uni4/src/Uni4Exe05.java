import java.util.Scanner;

public class Uni4Exe05 {
    public static String validacao(String respo){
        if (respo.equals("true")){
            return "Sim";
        } else{
            return "Não";
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("A cor é azul? ");
        String resposta = teclado.nextLine();

        System.out.print(validacao(resposta));

        teclado.close();
    }
}
