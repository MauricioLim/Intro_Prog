import java.util.Scanner;

public class Uni4Exe13 {
    Scanner teclado = new Scanner(System.in);
    int carta1, carta2, carta3, boas;
    
    public Uni4Exe13(){
        entrada();
        cartas();
        truco();
    }

    private void entrada(){
        System.out.println("Informe as 3 cartas");

        carta1 = teclado.nextInt();
        carta2 = teclado.nextInt();
        carta3 = teclado.nextInt();
    }

    private void cartas(){
        if (carta1 == 1 || carta1 == 2 || carta1 == 3){
            boas += 1;
        } 
        if(carta2 == 1 || carta2 == 2 || carta2 == 3){
            boas += 1;
        }
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            boas += 1;
        }
    }

    private void truco(){
        if (boas == 1){
            System.out.print("TRUCO");
        } else if (boas == 2){
            System.out.print("SEIS");
        } else if(boas == 3){
            System.out.print("NOVE");
        }
    }

    public static void main(String[] args) {
        new Uni4Exe13();
    }
}
