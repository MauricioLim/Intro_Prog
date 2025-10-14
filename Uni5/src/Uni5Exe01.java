import java.util.Scanner;

public class Uni5Exe01 {

    Scanner teclado = new Scanner(System.in);

    public Uni5Exe01(){
        repeticao();
    }

    public void repeticao(){
        for (int i = 0; i <= 19; i++) {
            int numero = entrada();
            verifica(numero);
        }
    }


    public int entrada(){
        int op = teclado.nextInt();
        return op;
    }

    public void verifica(int n){
        if (n % 2 == 0){
            System.out.println("Par");
        } else{
            System.out.println("Impar");
        }
    }

    public static void main(String[] args) {
        new Uni5Exe01();
    }
}
