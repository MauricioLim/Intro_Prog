import java.util.Scanner;

public class Uni4Exe20 {
    Scanner teclado = new Scanner(System.in);
    private double notaProva1, notaProva2, notaProva3, notaExer, media;

    public Uni4Exe20(){
        entrada();
        media();
        conversao();
    }

    public void entrada(){
        System.out.print("Nota da prova 1: ");
        this.notaProva1 = teclado.nextDouble();

        System.out.print("Nota da prova 2: ");
        this.notaProva2 = teclado.nextDouble();

        System.out.print("Nota da prova 3: ");
        this.notaProva3 = teclado.nextDouble();

        System.out.print("Nota dos exer: ");
        this.notaExer = teclado.nextDouble();
    }

    public void media(){
        this.media = (notaProva1 + (notaProva2 * 2) + (notaProva3 * 3) + notaExer) / 7;
    }

    public void conversao(){
        if (media >= 9){
            System.out.printf("A média de aproveitamento foi: %.2f \nConceito: A. Aprovado", media);
        } else if (media >= 7.5 && media < 9) {
            System.out.printf("A média de aproveitamento foi: %.2f \nConceito: B. Aprovado", media);
        } else if (media >= 6 && media <7.5){
            System.out.printf("A média de aproveitamento foi: %.2f \nConceito: C. Aprovado", media);
        } else if (media >= 4 && media < 6){
            System.out.printf("A média de aproveitamento foi: %.2f \nConceito: D. Reprovado", media);
        } else if (media < 4){
            System.out.printf("A média de aproveitamento foi: %.2f \nConceito: E. Reprovado", media);
        } else {
            System.out.print("Media invalida");
        }
    }

    public static void main(String[] args) {
        new Uni4Exe20();
    }

}
