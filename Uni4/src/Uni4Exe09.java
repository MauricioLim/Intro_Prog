import java.util.Scanner;

public class Uni4Exe09 {
    Scanner teclado = new Scanner(System.in);
    int n1, n2;

    public Uni4Exe09(){
        entrada();
        multiplo();
    }

    private void entrada(){
        System.out.print("Informe o primeiro número: ");
        n1 = teclado.nextInt();

        System.out.print("Informe o segundo número: ");
        n2 = teclado.nextInt();
    }

    private void multiplo(){
        if(n1 % n2 == 0 || n2 % n1 == 0){
            System.out.print("Os valores são multiplos");
        } else{
            System.out.print("Os valores não são múltiplos");
        }
    }

    public static void main(String[] args) {
        new Uni4Exe09();
    }
}
