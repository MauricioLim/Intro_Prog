import java.util.Scanner;

public class Uni4Exe10 {
    Scanner teclado = new Scanner(System.in);
    int mar, zezi, lulu;

    public Uni4Exe10(){
        entrada();
        verificao();
    }

    private void entrada(){
        System.out.print("Informe a idade de Marquinhos: ");
        mar = teclado.nextInt();

        System.out.print("Informe a idade de Zezinho: ");
        zezi = teclado.nextInt();

        System.out.print("Informe a idade de Luluzinha: ");
        lulu = teclado.nextInt();
    }

    private void verificao(){
        if (mar < zezi && mar < lulu) {
            System.err.print("Marquinhos é o caçula");
        } else if(zezi < mar && zezi < lulu){
            System.out.println("Zezinho é o caçula");
        } else{
            System.out.println("Luluzinha é a caçula");
        }
    }

    public static void main(String[] args) {
        new Uni4Exe10();
    }

}
