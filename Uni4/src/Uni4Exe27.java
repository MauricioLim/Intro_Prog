import java.util.Scanner;

public class Uni4Exe27 {
    Scanner teclado = new Scanner(System.in);
    int horaCheg, minCheg, horaSai, minSai;

    public Uni4Exe27(){
        entrada();
    }

    public void entrada(){
        System.out.print("hora chegada: ");
        this.horaCheg = teclado.nextInt();

        System.out.print("minutos chegada: ");
        this.minCheg = teclado.nextInt();

        System.out.print("hora saida: ");
        this.horaSai = teclado.nextInt();

        System.out.print("Minutos chegada: ");
        this.minSai = teclado.nextInt();
    }

}
