import java.util.Scanner;

public class Questao1 {
    Scanner teclado = new Scanner(System.in);
    double altura, peso;

    public Questao1 () {
        entrada();
        validacao();
    }

    public void entrada(){
        System.out.print("Altura: ");
        this.altura = teclado.nextDouble();

        System.out.print("Peso: ");
        this.peso = teclado.nextDouble();
    }

    public void validacao(){
        if (this.altura <= 1 && this.peso <= 50){
            System.out.println("Subnutrido");
            System.out.println("Perigo de Vida");
        } else if (this.altura > 5 || this.peso > 300){
            System.err.println("Pegar medidas novamente");
        } else {
            System.out.println("Normal");
        }

        System.out.println("fim");
    }

    public static void main(String[] args) throws Exception {
        new Questao1();
    }
}
