import java.util.Scanner;

public class Questao3 {
    Scanner teclado = new Scanner (System.in);
    char entrada;

    public Questao3(){
        entrada();
        verifica();
    }

    public void entrada(){
        System.out.print("Código do carro: ");
        this.entrada = teclado.nextLine().toUpperCase().charAt(0);
    }

    public void verifica(){
        if (this.entrada == 'A'){
            System.out.print("Porsche");
        } else if (this.entrada == 'B'){
            System.out.print("Fusca");
        } else if (this.entrada == 'C'){
            System.out.print("Gol");
        } else{
            System.out.print("Entrada Incorreta");
        }
    }

    public static void main(String[] args) {
        new Questao3();
    }

}
